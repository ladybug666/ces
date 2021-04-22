package com.ladybug.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class jsonController {
    @RequestMapping("/json")
    public String json(){
        /*{"charset":["UTF-8"],"out_trade_no":["10"],"method":["alipay.trade.page.pay.return"]
            ,"total_amount":["10.00"],"sign":["pb/kzZjNluTz3+XBen2GRhUiaJCVZE4qut7A8foPOnLnYyWdU/Dnpta4ky4JTvabD55Q8JFHtoj2ylEx1peM9oC+s0KgRCTAfKemZqDsoZQC9OwC4TQda/jf2oOKy/e3m0n02w6tZIjstVcuz63KdqvxmTiyoqax20PyFEHp+glB6nIFru/sP1CNbZG2VWCHGyh+NX7r6VcMIeLAQMVgusgwBPt7TDPE/x8CvWrc5vpm1b92zBbtrtWBpFV/t+/Xht7QVfW4qeLNeehXMPnd92IRqftuiFWDaHpUBdjPpfmfT7KCFUS6uaMQkPGnKUUcrrOYRYlkCjEqsmbgbphMiQ=="]
            ,"trade_no":["2021041622001405210501302782"],"auth_app_id":["2021000117637263"],"version":["1.0"]
            ,"app_id":["2021000117637263"],"sign_type":["RSA2"],"seller_id":["2088621955564696"],
            "timestamp":["2021-04-16 13:02:57"]}*/
        Map<String,String[]> map=new HashMap<>();

    }
}

