package com.AliPay;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: mo pan
 * @Description: TODO
 */
public class StringPay {
    public static void main(String[] args) {


    String pay="支付宝额外获得27张福卡方法 2021最新\n" +
            "参与方法：【链接直接发到支付宝好友框里 一个一个打开 输入验证获得随机卡】\n" +
            "第1个：https://render.alipay.com/p/c/17yq18lq3slc?source=JING_LING\n" +
            "第2个：https://render.alipay.com/p/c/17yq18lq3slc?source=FEI_ZHU\n" +
            "第3个：https://render.alipay.com/p/c/17yq18lq3slc?source=YOUKU_TV\n" +
            "第4个：https://render.alipay.com/p/c/17yq18lq3slc?source=PIAO_PIAO\n" +
            "第5个：https://render.alipay.com/p/c/17yq18lq3slc?source=TIAN_MAO\n" +
            "第6个：https://render.alipay.com/p/c/17yq18lq3slc?source=KAO_LA\n" +
            "第7个：https://render.alipay.com/p/c/17yq18lq3slc?source=CAI_NIAO\n" +
            "第8个：https://render.alipay.com/p/c/17yq18lq3slc?source=XINHUA_SHE\n" +
            "第9个：https://render.alipay.com/p/c/17yq18lq3slc?source=BAI_JINGTU\n" +
            "第10个：https://render.alipay.com/p/c/17yq18lq3slc?source=KE_CHUANG\n" +
            "第11个：https://render.alipay.com/p/c/17yq18lq3slc?source=KEJI_ZHIJIA\n" +
            "第12个：https://render.alipay.com/p/c/17yq18lq3slc?source=JIEFANG_RIBAO\n" +
            "第13个：https://render.alipay.com/p/c/17yq18lq3slc?source=DA_WAN\n" +
            "第14个：https://render.alipay.com/p/c/17yq18lq3slc?source=ZIJIN_SHAN\n" +
            "第15个：https://render.alipay.com/p/c/17yq18lq3slc?source=ZHONGGUO_LAN\n" +
            "第16个：https://render.alipay.com/p/c/17yq18lq3slc?source=CAI_LIFANG\n" +
            "第17个：https://render.alipay.com/p/c/17yq18lq3slc?source=ZHENG_GUAN\n" +
            "第18个：https://render.alipay.com/p/c/17yq18lq3slc?source=JIANGXI_XINWEN\n" +
            "第19个：https://render.alipay.com/p/c/17yq18lq3slc?source=YANG_CHENG\n" +
            "第20个：https://render.alipay.com/p/c/17yq18lq3slc?source=NAN_DU\n" +
            "第21个：https://render.alipay.com/p/c/17yq18lq3slc?source=SANYA_RIBAO\n" +
            "第22个：https://render.alipay.com/p/c/17yq18lq3slc?source=CHUNCHENG_WANBAO\n" +
            "第23个：https://render.alipay.com/p/c/17yq18lq3slc?source=GUIZHOU_DUSHIBAO\n" +
            "第24个：https://render.alipay.com/p/c/17yq18lq3slc?source=HUANG_HE\n" +
            "第25个：https://render.alipay.com/p/c/17yq18lq3slc?source=SHANXI_TOUTIAO\n" +
            "第26个：https://render.alipay.com/p/c/17yq18lq3slc?source=XINJING_BAO\n" +
            "第27个：https://render.alipay.com/p/c/17yq18lq3slc?source=JIN_YUN";

        //0. 准备好正则
        String regex = "(https?|ftp|file|http)://[-A-Za-z0-9+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]";
        StringPay stringPay = new StringPay();
        String s = stringPay.filterSpecialStr(regex, pay);
        System.out.println(s);

    }

    /**
     * 参数1 regex:我们的正则字符串
     * 参数2 就是一大段文本，这里用data表示
     */
    private String filterSpecialStr(String regex, String data) {
        //sb存放正则匹配的结果
        StringBuffer sb = new StringBuffer();
        //编译正则字符串
        Pattern p = Pattern.compile(regex);
        //利用正则去匹配
        Matcher matcher = p.matcher(data);
        //如果找到了我们正则里要的东西
        while (matcher.find()) {
            //保存到sb中，"\r\n"表示找到一个放一行，就是换行
            sb.append(matcher.group() + "\r\n\n");
        }
        return sb.toString();
    }
}