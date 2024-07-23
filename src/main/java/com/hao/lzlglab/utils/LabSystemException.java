package com.hao.lzlglab.utils;

public class LabSystemException extends RuntimeException{

    //状态码
    private int code;
    //提示信息
    private String message;

    //获取状态码
    public int getCode(){
        return code;
    }
    //获取提示信息
    public String getMessage(){
        return message;
    }

    public LabSystemException(CodeMsgEnum codeMsgEnum){
        super(codeMsgEnum.getMsg());
        this.code = codeMsgEnum.getCode();
        this.message = codeMsgEnum.getMsg();
    }

    /**
     *
     * @param code 状态码
     * @param message 错误信息
     */
    public LabSystemException(int code, String message){
        this.code=code;
        this.message=message;
    }



    public enum CodeMsgEnum {
        //响应失败
        ERROR(500, "服务器内部错误"),

        //用户名不能为空
        USER_USERNAME_IS_NOT_NULL(501, "用户名不能为空"),

        //密码不能为空
        USER_PASSWORD_IS_NOT_NULL(502, "密码不能为空"),

        //用户名或密码错误
        USER_USERNAME_OR_PASSWORD_ERROR(503, "用户名或密码错误"),

        //用户未登录
        USER_IS_NOT_LOGIN(504, "用户未登录"),

        //登录过期
        USER_LOGIN_TIMEOUT(505, "用户身份登录过期"),

        //令牌失效
        USER_TOKEN_IS_INVALID(506, "无效token"),

        //用户ID不能为空
        USER_ID_IS_NOT_NULL(507, "用户ID不能为空"),

        //用户对象不存在
        USER_IS_NOT_EXIST(508, "管理员对象不存在"),

        //用户用户名已存在
        USER_USERNAME_IS_EXIST(509, "用户名已经被占用，请更换重试"),

        //待删除用户ID集合不能为空
        TO_BE_DELETE_USER_IDS_IS_NOT_NULL(510, "待删除管理员ID集合不能为空"),

        //文件格式错误
        FILE_TYPE_ERROR(511, "图片类型错误，只能是 .jpg 或 .png格式 "),


        //登录账号与登录系统不符
        LOGIN_IDENTITY_IS_INVALID(512, "账号权限不足，请联系管理员"),

        CUSTOMER_IS_NULL(513,"顾客不存在"),

        //账号已被封禁，请联系管理员
        USER_STATUS_CLOSE(514, "账号已被封禁，请联系管理员"),
        //新旧密码不能相同
        SAME_OLD_PASSWORD(515, "不能与原密码相同"),
        //密码错误
        PASSWORD_ERROR(516, "密码错误,验证不通过"),

        PART_IS_NOT_EXIST(517,"零件不存在"),

        ADMIN_OR_LAB_IS_EMPTY(518,"管理员或实验室不存在"),

        TYPE_ID_IS_USING(519,"该类型还在应用")

        ;


        //响应状态码
        int code;
        //响应信息
        String msg;

        //全参构造器
        CodeMsgEnum(int code, String errorMessage) {
            this.code = code;
            this.msg = errorMessage;
        }

        //获取响应状态码
        public int getCode() {
            return code;
        }

        //获取响应信息
        public String getMsg() {
            return msg;
        }
    }




}
