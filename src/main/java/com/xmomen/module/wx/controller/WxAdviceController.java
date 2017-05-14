package com.xmomen.module.wx.controller;

import com.xmomen.module.advice.model.AdviceModel;
import com.xmomen.module.advice.service.AdviceService;
import com.xmomen.module.base.entity.CdMember;
import com.xmomen.module.base.service.MemberSercvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 获取最新快报咨询
 *
 * @author tanxinzheng
 * @version 1.0.0
 * @date 2017-3-29 0:27:52
 */
@RestController
@RequestMapping(value = "/wx/advice")
public class WxAdviceController {

    @Autowired
    AdviceService adviceService;


    /**
     * 更新客户手机号
     */
    @RequestMapping(value = "/getLastNew", method = RequestMethod.GET)
    public AdviceModel getLastNew() {
        return adviceService.getAdviceModelList().get(0);
    }
}