package com.management.backend.api.service;

/**
 * @ClassName AmazonStoreProfit
 * @Description 商家利润计算
 * @Author IvenYan
 * @Date 2019/6/30 22:40
 * @Version 1.0
 **/
public class AmazonStoreProfit {
//    设置利润率
    private static double profitRate=0.735;
//      美元
    private static double USDExchangeRate=6.865;
//    英镑
    private static double GBPExchangeRate=8.713;
//    欧元
    private static double EURExchangeRate=7.804;

    static double setProfitRate(double productPrice,double productTransportation,String profitType){

        double total=0.0;
        switch(profitType){
            case "美元" :
                total=((productPrice+productTransportation)/(1-profitRate))*USDExchangeRate;
                break; //可选
            case "英镑" :
                total=((productPrice+productTransportation)/(1-profitRate))*GBPExchangeRate;
                break; //可选
            case "欧元" :
                total=((productPrice+productTransportation)/(1-profitRate))*EURExchangeRate;
                break; //可选
            default : //可选

        }
        return total;

    }
}
