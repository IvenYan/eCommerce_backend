package com.management.backend.api.service;

import com.management.backend.api.controller.ClassifyController;
import com.management.backend.api.mybatis.mapper.AmazonClassifyMapper;
import com.management.backend.api.mybatis.mapper.ClassifyMapper;
import com.management.backend.api.mybatis.model.AmazonClassify;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @ClassName SyncProductClassifyJson
 * @Description TODO
 * @Author IvenYan
 * @Date 2019/8/7 19:46
 * @Version 1.0
 **/

public class ThreadPoolSyncProductClassifyJson{
    protected  final Logger log = LoggerFactory.getLogger(ThreadPoolSyncProductClassifyJson.class);
    @Autowired
    private AmazonClassifyMapper amazonClassifyMapper;

    private ThreadLocal<List<AmazonClassify>> list0=new ThreadLocal<List<AmazonClassify>>();

    public ThreadLocal<List<AmazonClassify>> getList0() {
        return list0;
    }

    public void setList0(ThreadLocal<List<AmazonClassify>> list0) {
        this.list0 = list0;
    }

    //单例模式
    private ThreadPoolSyncProductClassifyJson() {
    }

    private static ThreadPoolSyncProductClassifyJson instance;
    public static ThreadPoolSyncProductClassifyJson getInstance(){
        if(ThreadPoolSyncProductClassifyJson.instance ==null){
            ThreadPoolSyncProductClassifyJson.instance=new ThreadPoolSyncProductClassifyJson();
        }
        return ThreadPoolSyncProductClassifyJson.instance;
    }
    public void execute(int pid){
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(12, 12, 2000, TimeUnit.MICROSECONDS, new ArrayBlockingQueue<Runnable>(1000));
        ArrayList<SyncProductClassifyJson> list = new ArrayList<>();
        List<AmazonClassify> amazonClassifies = amazonClassifyMapper.selectAmazonProductClassifyV2ByPid(pid);
        for (int i = 0; i <amazonClassifies.size() ; i++) {
            list.add(new SyncProductClassifyJson(amazonClassifies.get(i).getId()));
        }

        try {
            List<Future<Object>> futures = threadPoolExecutor.invokeAll(list);
            futures.stream().forEach(future->{
                try {
//未完待续
//                    amazonClassifies.add
//                    list0.
                    future.get();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            });
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }



    private class SyncProductClassifyJson implements Callable<Object> {
        @Autowired
        private AmazonClassifyMapper amazonClassifyMapper;
    //    设置pid，父级ID，默认为0
        private  int pid;
        private  final File file=new File("F:/02Tmp/new 5.xml");

        public SyncProductClassifyJson(int pid) {
            this.pid = pid;
        }

        @Override
    //    主方法，请求后台数据库中的多级表
        public Object call() throws Exception {
            List<AmazonClassify> list0 = amazonClassifyMapper.selectAmazonProductClassifyV2ByPid(pid);
    //        递归查找子文件
            List<AmazonClassify> amazonClassifies = demoFunction(list0);

            return amazonClassifies;
        }

        //    测试专用-v11
        private List<AmazonClassify> demoFunction(List<AmazonClassify> list){
            for(AmazonClassify item:list ){
                log.debug("demoFunction="+item.getId()+";"+item.getValue());
                List<AmazonClassify> list1 = amazonClassifyMapper.selectAmazonProductClassifyV2ByPid(item.getId());
                if(list1.size()>0){
                    item.setChildren(list1);
                    demoFunction(list1);
                }else{
                    continue;
                }
            }
            return list;
        }
    }

}
