package cn.yujian95.base.dto.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author YuJian95  clj9509@163.com
 * @date 2020/1/20
 */

@ApiModel(value = "PowerAccountRegisterParam",description = "账号注册对象参数")
@Data
public class PowerAccountRegisterParam implements Serializable {
    /**
     * 登录账号 唯一
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "登录账号 唯一")
    private String name;

    /**
     * 登录密码 使用md5加密
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "登录密码 使用md5加密")
    private String password;
}