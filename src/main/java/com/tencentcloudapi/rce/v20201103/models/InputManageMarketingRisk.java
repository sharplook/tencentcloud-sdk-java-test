/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.rce.v20201103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputManageMarketingRisk extends AbstractModel{

    /**
    * 账号信息。
    */
    @SerializedName("Account")
    @Expose
    private AccountInfo Account;

    /**
    * 场景code;
e_activity_antirush；活动防刷场景e_login_protection；登陆保护场景e_register_protection：注册保护场景
    */
    @SerializedName("SceneCode")
    @Expose
    private String SceneCode;

    /**
    * 登录来源的外网IP
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
    * 用户操作时间戳，单位秒（格林威治时间精确到秒，如1501590972）。
    */
    @SerializedName("PostTime")
    @Expose
    private Long PostTime;

    /**
    * 用户唯一标识。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 设备指纹token。
    */
    @SerializedName("DeviceToken")
    @Expose
    private String DeviceToken;

    /**
    * 设备指纹BusinessId
    */
    @SerializedName("DeviceBusinessId")
    @Expose
    private Long DeviceBusinessId;

    /**
    * 业务ID。网站或应用在多个业务中使用此服务，通过此ID区分统计数据。
    */
    @SerializedName("BusinessId")
    @Expose
    private Long BusinessId;

    /**
    * 昵称，UTF-8 编码。
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * 用户邮箱地址（非系统自动生成）。
    */
    @SerializedName("EmailAddress")
    @Expose
    private String EmailAddress;

    /**
    * 是否识别设备异常：
0：不识别。
1：识别。
    */
    @SerializedName("CheckDevice")
    @Expose
    private Long CheckDevice;

    /**
    * 用户HTTP请求中的Cookie进行2次hash的值，只要保证相同Cookie的hash值一致即可。
    */
    @SerializedName("CookieHash")
    @Expose
    private String CookieHash;

    /**
    * 用户HTTP请求的Referer值。
    */
    @SerializedName("Referer")
    @Expose
    private String Referer;

    /**
    * 用户HTTP请求的User-Agent值。
    */
    @SerializedName("UserAgent")
    @Expose
    private String UserAgent;

    /**
    * 用户HTTP请求的X-Forwarded-For值。
    */
    @SerializedName("XForwardedFor")
    @Expose
    private String XForwardedFor;

    /**
    * MAC地址或设备唯一标识。
    */
    @SerializedName("MacAddress")
    @Expose
    private String MacAddress;

    /**
    * 手机制造商ID，如果手机注册，请带上此信息。
    */
    @SerializedName("VendorId")
    @Expose
    private String VendorId;

    /**
    * 设备类型：
1：Android
2：IOS
    */
    @SerializedName("DeviceType")
    @Expose
    private Long DeviceType;

    /**
    * 详细信息
FieldName 清单
Android serial_number String 否 设备序列号
Android carrier String 否 运营商；-1: 获取失败，0: 其他，1: 移动，2: 联通，3: 电信，4: 铁通
Android mcc_mnc String 否 netOperator MCC+MNC
Android model String 否 手机型号
Android os_system String 否 操作系统
Android vendor_id String 否 设备品牌 “华为”“oppo”“小米”
Android device_version String 否 设备版本
Android android_api_level String 否 安卓API等级
Android phone_chip_info String 否 手机芯片信息
Android resolution_w String 否 屏幕分辨率宽，保留整数
Android resolution_h String 否 屏幕分辨率高，保留整数
Android brightness String 否 屏幕亮度
Android bluetooth_address String 否 蓝牙地址
Android baseband_version String 否 基带版本
Android kernel_version String 否 kernel 版本
Android cpu_core String 否 CPU 核数
Android cpu_model String 否 CPU 型号
Android memory String 否 内存容量，单位转换为 GB
Android storage String 否 存储容量，单位转换为 GB
Android volume String 否 手机音量
Android battery_power String 否 电池电量
Android language String 否 语言
Android package_name String 否 软件包名
Android app_version String 否 app 版本号
Android app_name String 否 app 显示名称
Android is_debug String 否 是否 debug；0 为正常模式，1 为 debug 模式；其他值无效
Android is_root String 否 是否越狱；0 为正常，1 为越狱；其他值无效
Android is_proxy String 否 是否启动代理；0 为未开启，1 为开启；其他值无效
Android is_emulator String 否 是否模拟器；0 为未开启，1 为开启；其他值无效
Android charge_status String 否 充电状态；1-不在充电，2-USB充电，3-电源充电
Android network_type String 否 网络类型：2G/3G/4G/5G/WiFi/WWAN/other
Android wifi_mac String 否 WiFi MAC地址
IOS model String 否 机器型号 iPhone11
IOS memory String 否 内存容量，单位转换为 GB
IOS os_system String 否 操作系统
IOS device_version String 否 设备版本
IOS phone_chip_info String 否 手机芯片信息
IOS device_name String 否 设备名称 "xxx 的 iPhone"，"xxx's IPhone" 等等
IOS uptime String 否 开机时间
IOS language String 否 系统语言
IOS carrier String 否 运营商
IOS cpu_model String 否 CPU 型号
IOS cpu_core String 否 CPU 个数
IOS volume String 否 手机音量
IOS battery_power String 否 电池电量
IOS resolution_w String 否 屏幕分辨率宽，保留整数
IOS resolution_h String 否 屏幕分辨率高，保留整数
IOS package_name String 否 app 包名
IOS app_version String 否 app 版本号
IOS app_name String 否 app 显示名称
IOS is_debug String 否 是否 debug；0 为正常模式，1 为 debug 模式；其他值无效
IOS is_root String 否 是否越狱；0 为正常，1 为越狱；其他值无效
IOS is_proxy String 否 是否启动代理；0 为未开启，1 为开启；其他值无效
IOS is_emulator String 否 是否模拟器；0 为未开启，1 为开启；其他值无效
IOS charge_status String 否 充电状态；1-不在充电，2-USB充电，3-电源充电
IOS network_type String 否 网络类型：2G/3G/4G/5G/WiFi/WWAN/other
IOS wifi_mac String 否 WiFi MAC地址
其他 os_system String 否 操作系统
其他 browser String 否 浏览器信息
其他 from_url String 否 来源链接
    */
    @SerializedName("Details")
    @Expose
    private InputDetails [] Details;

    /**
    * 可选填写。详情请跳转至SponsorInfo查看。
    */
    @SerializedName("Sponsor")
    @Expose
    private SponsorInfo Sponsor;

    /**
    * 可选填写。详情请跳转至OnlineScamInfo查看。
    */
    @SerializedName("OnlineScam")
    @Expose
    private OnlineScamInfo OnlineScam;

    /**
     * Get 账号信息。 
     * @return Account 账号信息。
     */
    public AccountInfo getAccount() {
        return this.Account;
    }

    /**
     * Set 账号信息。
     * @param Account 账号信息。
     */
    public void setAccount(AccountInfo Account) {
        this.Account = Account;
    }

    /**
     * Get 场景code;
e_activity_antirush；活动防刷场景e_login_protection；登陆保护场景e_register_protection：注册保护场景 
     * @return SceneCode 场景code;
e_activity_antirush；活动防刷场景e_login_protection；登陆保护场景e_register_protection：注册保护场景
     */
    public String getSceneCode() {
        return this.SceneCode;
    }

    /**
     * Set 场景code;
e_activity_antirush；活动防刷场景e_login_protection；登陆保护场景e_register_protection：注册保护场景
     * @param SceneCode 场景code;
e_activity_antirush；活动防刷场景e_login_protection；登陆保护场景e_register_protection：注册保护场景
     */
    public void setSceneCode(String SceneCode) {
        this.SceneCode = SceneCode;
    }

    /**
     * Get 登录来源的外网IP 
     * @return UserIp 登录来源的外网IP
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set 登录来源的外网IP
     * @param UserIp 登录来源的外网IP
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    /**
     * Get 用户操作时间戳，单位秒（格林威治时间精确到秒，如1501590972）。 
     * @return PostTime 用户操作时间戳，单位秒（格林威治时间精确到秒，如1501590972）。
     */
    public Long getPostTime() {
        return this.PostTime;
    }

    /**
     * Set 用户操作时间戳，单位秒（格林威治时间精确到秒，如1501590972）。
     * @param PostTime 用户操作时间戳，单位秒（格林威治时间精确到秒，如1501590972）。
     */
    public void setPostTime(Long PostTime) {
        this.PostTime = PostTime;
    }

    /**
     * Get 用户唯一标识。 
     * @return UserId 用户唯一标识。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户唯一标识。
     * @param UserId 用户唯一标识。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 设备指纹token。 
     * @return DeviceToken 设备指纹token。
     */
    public String getDeviceToken() {
        return this.DeviceToken;
    }

    /**
     * Set 设备指纹token。
     * @param DeviceToken 设备指纹token。
     */
    public void setDeviceToken(String DeviceToken) {
        this.DeviceToken = DeviceToken;
    }

    /**
     * Get 设备指纹BusinessId 
     * @return DeviceBusinessId 设备指纹BusinessId
     */
    public Long getDeviceBusinessId() {
        return this.DeviceBusinessId;
    }

    /**
     * Set 设备指纹BusinessId
     * @param DeviceBusinessId 设备指纹BusinessId
     */
    public void setDeviceBusinessId(Long DeviceBusinessId) {
        this.DeviceBusinessId = DeviceBusinessId;
    }

    /**
     * Get 业务ID。网站或应用在多个业务中使用此服务，通过此ID区分统计数据。 
     * @return BusinessId 业务ID。网站或应用在多个业务中使用此服务，通过此ID区分统计数据。
     */
    public Long getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set 业务ID。网站或应用在多个业务中使用此服务，通过此ID区分统计数据。
     * @param BusinessId 业务ID。网站或应用在多个业务中使用此服务，通过此ID区分统计数据。
     */
    public void setBusinessId(Long BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * Get 昵称，UTF-8 编码。 
     * @return Nickname 昵称，UTF-8 编码。
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set 昵称，UTF-8 编码。
     * @param Nickname 昵称，UTF-8 编码。
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get 用户邮箱地址（非系统自动生成）。 
     * @return EmailAddress 用户邮箱地址（非系统自动生成）。
     */
    public String getEmailAddress() {
        return this.EmailAddress;
    }

    /**
     * Set 用户邮箱地址（非系统自动生成）。
     * @param EmailAddress 用户邮箱地址（非系统自动生成）。
     */
    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    /**
     * Get 是否识别设备异常：
0：不识别。
1：识别。 
     * @return CheckDevice 是否识别设备异常：
0：不识别。
1：识别。
     */
    public Long getCheckDevice() {
        return this.CheckDevice;
    }

    /**
     * Set 是否识别设备异常：
0：不识别。
1：识别。
     * @param CheckDevice 是否识别设备异常：
0：不识别。
1：识别。
     */
    public void setCheckDevice(Long CheckDevice) {
        this.CheckDevice = CheckDevice;
    }

    /**
     * Get 用户HTTP请求中的Cookie进行2次hash的值，只要保证相同Cookie的hash值一致即可。 
     * @return CookieHash 用户HTTP请求中的Cookie进行2次hash的值，只要保证相同Cookie的hash值一致即可。
     */
    public String getCookieHash() {
        return this.CookieHash;
    }

    /**
     * Set 用户HTTP请求中的Cookie进行2次hash的值，只要保证相同Cookie的hash值一致即可。
     * @param CookieHash 用户HTTP请求中的Cookie进行2次hash的值，只要保证相同Cookie的hash值一致即可。
     */
    public void setCookieHash(String CookieHash) {
        this.CookieHash = CookieHash;
    }

    /**
     * Get 用户HTTP请求的Referer值。 
     * @return Referer 用户HTTP请求的Referer值。
     */
    public String getReferer() {
        return this.Referer;
    }

    /**
     * Set 用户HTTP请求的Referer值。
     * @param Referer 用户HTTP请求的Referer值。
     */
    public void setReferer(String Referer) {
        this.Referer = Referer;
    }

    /**
     * Get 用户HTTP请求的User-Agent值。 
     * @return UserAgent 用户HTTP请求的User-Agent值。
     */
    public String getUserAgent() {
        return this.UserAgent;
    }

    /**
     * Set 用户HTTP请求的User-Agent值。
     * @param UserAgent 用户HTTP请求的User-Agent值。
     */
    public void setUserAgent(String UserAgent) {
        this.UserAgent = UserAgent;
    }

    /**
     * Get 用户HTTP请求的X-Forwarded-For值。 
     * @return XForwardedFor 用户HTTP请求的X-Forwarded-For值。
     */
    public String getXForwardedFor() {
        return this.XForwardedFor;
    }

    /**
     * Set 用户HTTP请求的X-Forwarded-For值。
     * @param XForwardedFor 用户HTTP请求的X-Forwarded-For值。
     */
    public void setXForwardedFor(String XForwardedFor) {
        this.XForwardedFor = XForwardedFor;
    }

    /**
     * Get MAC地址或设备唯一标识。 
     * @return MacAddress MAC地址或设备唯一标识。
     */
    public String getMacAddress() {
        return this.MacAddress;
    }

    /**
     * Set MAC地址或设备唯一标识。
     * @param MacAddress MAC地址或设备唯一标识。
     */
    public void setMacAddress(String MacAddress) {
        this.MacAddress = MacAddress;
    }

    /**
     * Get 手机制造商ID，如果手机注册，请带上此信息。 
     * @return VendorId 手机制造商ID，如果手机注册，请带上此信息。
     */
    public String getVendorId() {
        return this.VendorId;
    }

    /**
     * Set 手机制造商ID，如果手机注册，请带上此信息。
     * @param VendorId 手机制造商ID，如果手机注册，请带上此信息。
     */
    public void setVendorId(String VendorId) {
        this.VendorId = VendorId;
    }

    /**
     * Get 设备类型：
1：Android
2：IOS 
     * @return DeviceType 设备类型：
1：Android
2：IOS
     */
    public Long getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 设备类型：
1：Android
2：IOS
     * @param DeviceType 设备类型：
1：Android
2：IOS
     */
    public void setDeviceType(Long DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 详细信息
FieldName 清单
Android serial_number String 否 设备序列号
Android carrier String 否 运营商；-1: 获取失败，0: 其他，1: 移动，2: 联通，3: 电信，4: 铁通
Android mcc_mnc String 否 netOperator MCC+MNC
Android model String 否 手机型号
Android os_system String 否 操作系统
Android vendor_id String 否 设备品牌 “华为”“oppo”“小米”
Android device_version String 否 设备版本
Android android_api_level String 否 安卓API等级
Android phone_chip_info String 否 手机芯片信息
Android resolution_w String 否 屏幕分辨率宽，保留整数
Android resolution_h String 否 屏幕分辨率高，保留整数
Android brightness String 否 屏幕亮度
Android bluetooth_address String 否 蓝牙地址
Android baseband_version String 否 基带版本
Android kernel_version String 否 kernel 版本
Android cpu_core String 否 CPU 核数
Android cpu_model String 否 CPU 型号
Android memory String 否 内存容量，单位转换为 GB
Android storage String 否 存储容量，单位转换为 GB
Android volume String 否 手机音量
Android battery_power String 否 电池电量
Android language String 否 语言
Android package_name String 否 软件包名
Android app_version String 否 app 版本号
Android app_name String 否 app 显示名称
Android is_debug String 否 是否 debug；0 为正常模式，1 为 debug 模式；其他值无效
Android is_root String 否 是否越狱；0 为正常，1 为越狱；其他值无效
Android is_proxy String 否 是否启动代理；0 为未开启，1 为开启；其他值无效
Android is_emulator String 否 是否模拟器；0 为未开启，1 为开启；其他值无效
Android charge_status String 否 充电状态；1-不在充电，2-USB充电，3-电源充电
Android network_type String 否 网络类型：2G/3G/4G/5G/WiFi/WWAN/other
Android wifi_mac String 否 WiFi MAC地址
IOS model String 否 机器型号 iPhone11
IOS memory String 否 内存容量，单位转换为 GB
IOS os_system String 否 操作系统
IOS device_version String 否 设备版本
IOS phone_chip_info String 否 手机芯片信息
IOS device_name String 否 设备名称 "xxx 的 iPhone"，"xxx's IPhone" 等等
IOS uptime String 否 开机时间
IOS language String 否 系统语言
IOS carrier String 否 运营商
IOS cpu_model String 否 CPU 型号
IOS cpu_core String 否 CPU 个数
IOS volume String 否 手机音量
IOS battery_power String 否 电池电量
IOS resolution_w String 否 屏幕分辨率宽，保留整数
IOS resolution_h String 否 屏幕分辨率高，保留整数
IOS package_name String 否 app 包名
IOS app_version String 否 app 版本号
IOS app_name String 否 app 显示名称
IOS is_debug String 否 是否 debug；0 为正常模式，1 为 debug 模式；其他值无效
IOS is_root String 否 是否越狱；0 为正常，1 为越狱；其他值无效
IOS is_proxy String 否 是否启动代理；0 为未开启，1 为开启；其他值无效
IOS is_emulator String 否 是否模拟器；0 为未开启，1 为开启；其他值无效
IOS charge_status String 否 充电状态；1-不在充电，2-USB充电，3-电源充电
IOS network_type String 否 网络类型：2G/3G/4G/5G/WiFi/WWAN/other
IOS wifi_mac String 否 WiFi MAC地址
其他 os_system String 否 操作系统
其他 browser String 否 浏览器信息
其他 from_url String 否 来源链接 
     * @return Details 详细信息
FieldName 清单
Android serial_number String 否 设备序列号
Android carrier String 否 运营商；-1: 获取失败，0: 其他，1: 移动，2: 联通，3: 电信，4: 铁通
Android mcc_mnc String 否 netOperator MCC+MNC
Android model String 否 手机型号
Android os_system String 否 操作系统
Android vendor_id String 否 设备品牌 “华为”“oppo”“小米”
Android device_version String 否 设备版本
Android android_api_level String 否 安卓API等级
Android phone_chip_info String 否 手机芯片信息
Android resolution_w String 否 屏幕分辨率宽，保留整数
Android resolution_h String 否 屏幕分辨率高，保留整数
Android brightness String 否 屏幕亮度
Android bluetooth_address String 否 蓝牙地址
Android baseband_version String 否 基带版本
Android kernel_version String 否 kernel 版本
Android cpu_core String 否 CPU 核数
Android cpu_model String 否 CPU 型号
Android memory String 否 内存容量，单位转换为 GB
Android storage String 否 存储容量，单位转换为 GB
Android volume String 否 手机音量
Android battery_power String 否 电池电量
Android language String 否 语言
Android package_name String 否 软件包名
Android app_version String 否 app 版本号
Android app_name String 否 app 显示名称
Android is_debug String 否 是否 debug；0 为正常模式，1 为 debug 模式；其他值无效
Android is_root String 否 是否越狱；0 为正常，1 为越狱；其他值无效
Android is_proxy String 否 是否启动代理；0 为未开启，1 为开启；其他值无效
Android is_emulator String 否 是否模拟器；0 为未开启，1 为开启；其他值无效
Android charge_status String 否 充电状态；1-不在充电，2-USB充电，3-电源充电
Android network_type String 否 网络类型：2G/3G/4G/5G/WiFi/WWAN/other
Android wifi_mac String 否 WiFi MAC地址
IOS model String 否 机器型号 iPhone11
IOS memory String 否 内存容量，单位转换为 GB
IOS os_system String 否 操作系统
IOS device_version String 否 设备版本
IOS phone_chip_info String 否 手机芯片信息
IOS device_name String 否 设备名称 "xxx 的 iPhone"，"xxx's IPhone" 等等
IOS uptime String 否 开机时间
IOS language String 否 系统语言
IOS carrier String 否 运营商
IOS cpu_model String 否 CPU 型号
IOS cpu_core String 否 CPU 个数
IOS volume String 否 手机音量
IOS battery_power String 否 电池电量
IOS resolution_w String 否 屏幕分辨率宽，保留整数
IOS resolution_h String 否 屏幕分辨率高，保留整数
IOS package_name String 否 app 包名
IOS app_version String 否 app 版本号
IOS app_name String 否 app 显示名称
IOS is_debug String 否 是否 debug；0 为正常模式，1 为 debug 模式；其他值无效
IOS is_root String 否 是否越狱；0 为正常，1 为越狱；其他值无效
IOS is_proxy String 否 是否启动代理；0 为未开启，1 为开启；其他值无效
IOS is_emulator String 否 是否模拟器；0 为未开启，1 为开启；其他值无效
IOS charge_status String 否 充电状态；1-不在充电，2-USB充电，3-电源充电
IOS network_type String 否 网络类型：2G/3G/4G/5G/WiFi/WWAN/other
IOS wifi_mac String 否 WiFi MAC地址
其他 os_system String 否 操作系统
其他 browser String 否 浏览器信息
其他 from_url String 否 来源链接
     */
    public InputDetails [] getDetails() {
        return this.Details;
    }

    /**
     * Set 详细信息
FieldName 清单
Android serial_number String 否 设备序列号
Android carrier String 否 运营商；-1: 获取失败，0: 其他，1: 移动，2: 联通，3: 电信，4: 铁通
Android mcc_mnc String 否 netOperator MCC+MNC
Android model String 否 手机型号
Android os_system String 否 操作系统
Android vendor_id String 否 设备品牌 “华为”“oppo”“小米”
Android device_version String 否 设备版本
Android android_api_level String 否 安卓API等级
Android phone_chip_info String 否 手机芯片信息
Android resolution_w String 否 屏幕分辨率宽，保留整数
Android resolution_h String 否 屏幕分辨率高，保留整数
Android brightness String 否 屏幕亮度
Android bluetooth_address String 否 蓝牙地址
Android baseband_version String 否 基带版本
Android kernel_version String 否 kernel 版本
Android cpu_core String 否 CPU 核数
Android cpu_model String 否 CPU 型号
Android memory String 否 内存容量，单位转换为 GB
Android storage String 否 存储容量，单位转换为 GB
Android volume String 否 手机音量
Android battery_power String 否 电池电量
Android language String 否 语言
Android package_name String 否 软件包名
Android app_version String 否 app 版本号
Android app_name String 否 app 显示名称
Android is_debug String 否 是否 debug；0 为正常模式，1 为 debug 模式；其他值无效
Android is_root String 否 是否越狱；0 为正常，1 为越狱；其他值无效
Android is_proxy String 否 是否启动代理；0 为未开启，1 为开启；其他值无效
Android is_emulator String 否 是否模拟器；0 为未开启，1 为开启；其他值无效
Android charge_status String 否 充电状态；1-不在充电，2-USB充电，3-电源充电
Android network_type String 否 网络类型：2G/3G/4G/5G/WiFi/WWAN/other
Android wifi_mac String 否 WiFi MAC地址
IOS model String 否 机器型号 iPhone11
IOS memory String 否 内存容量，单位转换为 GB
IOS os_system String 否 操作系统
IOS device_version String 否 设备版本
IOS phone_chip_info String 否 手机芯片信息
IOS device_name String 否 设备名称 "xxx 的 iPhone"，"xxx's IPhone" 等等
IOS uptime String 否 开机时间
IOS language String 否 系统语言
IOS carrier String 否 运营商
IOS cpu_model String 否 CPU 型号
IOS cpu_core String 否 CPU 个数
IOS volume String 否 手机音量
IOS battery_power String 否 电池电量
IOS resolution_w String 否 屏幕分辨率宽，保留整数
IOS resolution_h String 否 屏幕分辨率高，保留整数
IOS package_name String 否 app 包名
IOS app_version String 否 app 版本号
IOS app_name String 否 app 显示名称
IOS is_debug String 否 是否 debug；0 为正常模式，1 为 debug 模式；其他值无效
IOS is_root String 否 是否越狱；0 为正常，1 为越狱；其他值无效
IOS is_proxy String 否 是否启动代理；0 为未开启，1 为开启；其他值无效
IOS is_emulator String 否 是否模拟器；0 为未开启，1 为开启；其他值无效
IOS charge_status String 否 充电状态；1-不在充电，2-USB充电，3-电源充电
IOS network_type String 否 网络类型：2G/3G/4G/5G/WiFi/WWAN/other
IOS wifi_mac String 否 WiFi MAC地址
其他 os_system String 否 操作系统
其他 browser String 否 浏览器信息
其他 from_url String 否 来源链接
     * @param Details 详细信息
FieldName 清单
Android serial_number String 否 设备序列号
Android carrier String 否 运营商；-1: 获取失败，0: 其他，1: 移动，2: 联通，3: 电信，4: 铁通
Android mcc_mnc String 否 netOperator MCC+MNC
Android model String 否 手机型号
Android os_system String 否 操作系统
Android vendor_id String 否 设备品牌 “华为”“oppo”“小米”
Android device_version String 否 设备版本
Android android_api_level String 否 安卓API等级
Android phone_chip_info String 否 手机芯片信息
Android resolution_w String 否 屏幕分辨率宽，保留整数
Android resolution_h String 否 屏幕分辨率高，保留整数
Android brightness String 否 屏幕亮度
Android bluetooth_address String 否 蓝牙地址
Android baseband_version String 否 基带版本
Android kernel_version String 否 kernel 版本
Android cpu_core String 否 CPU 核数
Android cpu_model String 否 CPU 型号
Android memory String 否 内存容量，单位转换为 GB
Android storage String 否 存储容量，单位转换为 GB
Android volume String 否 手机音量
Android battery_power String 否 电池电量
Android language String 否 语言
Android package_name String 否 软件包名
Android app_version String 否 app 版本号
Android app_name String 否 app 显示名称
Android is_debug String 否 是否 debug；0 为正常模式，1 为 debug 模式；其他值无效
Android is_root String 否 是否越狱；0 为正常，1 为越狱；其他值无效
Android is_proxy String 否 是否启动代理；0 为未开启，1 为开启；其他值无效
Android is_emulator String 否 是否模拟器；0 为未开启，1 为开启；其他值无效
Android charge_status String 否 充电状态；1-不在充电，2-USB充电，3-电源充电
Android network_type String 否 网络类型：2G/3G/4G/5G/WiFi/WWAN/other
Android wifi_mac String 否 WiFi MAC地址
IOS model String 否 机器型号 iPhone11
IOS memory String 否 内存容量，单位转换为 GB
IOS os_system String 否 操作系统
IOS device_version String 否 设备版本
IOS phone_chip_info String 否 手机芯片信息
IOS device_name String 否 设备名称 "xxx 的 iPhone"，"xxx's IPhone" 等等
IOS uptime String 否 开机时间
IOS language String 否 系统语言
IOS carrier String 否 运营商
IOS cpu_model String 否 CPU 型号
IOS cpu_core String 否 CPU 个数
IOS volume String 否 手机音量
IOS battery_power String 否 电池电量
IOS resolution_w String 否 屏幕分辨率宽，保留整数
IOS resolution_h String 否 屏幕分辨率高，保留整数
IOS package_name String 否 app 包名
IOS app_version String 否 app 版本号
IOS app_name String 否 app 显示名称
IOS is_debug String 否 是否 debug；0 为正常模式，1 为 debug 模式；其他值无效
IOS is_root String 否 是否越狱；0 为正常，1 为越狱；其他值无效
IOS is_proxy String 否 是否启动代理；0 为未开启，1 为开启；其他值无效
IOS is_emulator String 否 是否模拟器；0 为未开启，1 为开启；其他值无效
IOS charge_status String 否 充电状态；1-不在充电，2-USB充电，3-电源充电
IOS network_type String 否 网络类型：2G/3G/4G/5G/WiFi/WWAN/other
IOS wifi_mac String 否 WiFi MAC地址
其他 os_system String 否 操作系统
其他 browser String 否 浏览器信息
其他 from_url String 否 来源链接
     */
    public void setDetails(InputDetails [] Details) {
        this.Details = Details;
    }

    /**
     * Get 可选填写。详情请跳转至SponsorInfo查看。 
     * @return Sponsor 可选填写。详情请跳转至SponsorInfo查看。
     */
    public SponsorInfo getSponsor() {
        return this.Sponsor;
    }

    /**
     * Set 可选填写。详情请跳转至SponsorInfo查看。
     * @param Sponsor 可选填写。详情请跳转至SponsorInfo查看。
     */
    public void setSponsor(SponsorInfo Sponsor) {
        this.Sponsor = Sponsor;
    }

    /**
     * Get 可选填写。详情请跳转至OnlineScamInfo查看。 
     * @return OnlineScam 可选填写。详情请跳转至OnlineScamInfo查看。
     */
    public OnlineScamInfo getOnlineScam() {
        return this.OnlineScam;
    }

    /**
     * Set 可选填写。详情请跳转至OnlineScamInfo查看。
     * @param OnlineScam 可选填写。详情请跳转至OnlineScamInfo查看。
     */
    public void setOnlineScam(OnlineScamInfo OnlineScam) {
        this.OnlineScam = OnlineScam;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Account.", this.Account);
        this.setParamSimple(map, prefix + "SceneCode", this.SceneCode);
        this.setParamSimple(map, prefix + "UserIp", this.UserIp);
        this.setParamSimple(map, prefix + "PostTime", this.PostTime);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "DeviceToken", this.DeviceToken);
        this.setParamSimple(map, prefix + "DeviceBusinessId", this.DeviceBusinessId);
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "EmailAddress", this.EmailAddress);
        this.setParamSimple(map, prefix + "CheckDevice", this.CheckDevice);
        this.setParamSimple(map, prefix + "CookieHash", this.CookieHash);
        this.setParamSimple(map, prefix + "Referer", this.Referer);
        this.setParamSimple(map, prefix + "UserAgent", this.UserAgent);
        this.setParamSimple(map, prefix + "XForwardedFor", this.XForwardedFor);
        this.setParamSimple(map, prefix + "MacAddress", this.MacAddress);
        this.setParamSimple(map, prefix + "VendorId", this.VendorId);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamArrayObj(map, prefix + "Details.", this.Details);
        this.setParamObj(map, prefix + "Sponsor.", this.Sponsor);
        this.setParamObj(map, prefix + "OnlineScam.", this.OnlineScam);

    }
}

