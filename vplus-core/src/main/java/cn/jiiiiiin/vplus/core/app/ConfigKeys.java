package cn.jiiiiiin.vplus.core.app;

/**
 * @author Created by jiiiiiin on 2017/8/4.
 */

public enum ConfigKeys {
    // 模式：DEV/PROD
    MODE,
    // 配置网络请求域名
    API_HOST,
    API_CONNECT_TIME_OUT,
    // 配置网络请求自定义头
    CUSTOM_HEADERS,
    // 配置webview加载的网页域名
    WEB_HOST,
    // 全局上下文
    APPLICATION_CONTEXT,
    // 标识配置初始化完毕与否
    CONFIG_READY,
    // OK Http拦截器
    INTERCEPTOR,
    // 微信应用相关授权信息：
    // AppID
    WE_CHAT_APP_ID,
    // AppSecret
    WE_CHAT_APP_SECRET,
    // 全局ACTIVITY（如：微信在返回的时候需要拉取我们的一个活动）
    ACTIVITY,
    HANDLER,
    // WEBVIEW USER_AGENT
    WEB_USER_AGENT,
    // WEBVIEW暴露的接口对象标识(设置JavascriptInterface的对象名)
    PASSWORD_MODULUS,
    API_READ_TIME_OUT,
    COMMON_PARAMS,
    RESP_STATE_HANDLER,
    EXIT_APP_WAIT_TIME,
    CERTIFICATES,
    SESSION_ID,
    APP_THEME_COLOR,
    SELF_H5_COMM_PARAMS,
    WEB_VIEW,
    ORIGIN_WEBVIEW_APP_CACHE_PATH,
    ROOT_DELEGATE,
    SERVER_STATUS_CODE_KEY,
    SERVER_STATUS_MSG_KEY,
    SERVER_STATUS_CODE_SUCCESS_FLAG,
    IS_DEVICE_ROOTED, DEBUG, SHARE_IMAGE_PATH, VERSION_CODE, VERSION_NAME, START_OTHER_ACTIVITY, START_THIRD_WEBVIEW_DELEGATE, APP_FIRST_LAUNCHED, SSL_HOSTNAME_VERIFIER, SSL_SOCKET_FACTORY, SSL_TRUST_MANAGER,
    WEBVIEW_CURRENT_LOAD_URL, ALLOW_ACCESS_URL_HOSTS,
}