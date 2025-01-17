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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoRewriteRequest extends AbstractModel{

    /**
    * 负载均衡实例ID。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * HTTPS:443监听器的ID。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * HTTPS:443监听器下需要重定向的域名，若不填，则对HTTPS:443监听器下的所有域名都设置重定向。
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * 重定向状态码，可取值301,302,307。
    */
    @SerializedName("RewriteCodes")
    @Expose
    private Long [] RewriteCodes;

    /**
    * 重定向是否携带匹配的URL。
    */
    @SerializedName("TakeUrls")
    @Expose
    private Boolean [] TakeUrls;

    /**
     * Get 负载均衡实例ID。 
     * @return LoadBalancerId 负载均衡实例ID。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例ID。
     * @param LoadBalancerId 负载均衡实例ID。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get HTTPS:443监听器的ID。 
     * @return ListenerId HTTPS:443监听器的ID。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set HTTPS:443监听器的ID。
     * @param ListenerId HTTPS:443监听器的ID。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get HTTPS:443监听器下需要重定向的域名，若不填，则对HTTPS:443监听器下的所有域名都设置重定向。 
     * @return Domains HTTPS:443监听器下需要重定向的域名，若不填，则对HTTPS:443监听器下的所有域名都设置重定向。
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set HTTPS:443监听器下需要重定向的域名，若不填，则对HTTPS:443监听器下的所有域名都设置重定向。
     * @param Domains HTTPS:443监听器下需要重定向的域名，若不填，则对HTTPS:443监听器下的所有域名都设置重定向。
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 重定向状态码，可取值301,302,307。 
     * @return RewriteCodes 重定向状态码，可取值301,302,307。
     */
    public Long [] getRewriteCodes() {
        return this.RewriteCodes;
    }

    /**
     * Set 重定向状态码，可取值301,302,307。
     * @param RewriteCodes 重定向状态码，可取值301,302,307。
     */
    public void setRewriteCodes(Long [] RewriteCodes) {
        this.RewriteCodes = RewriteCodes;
    }

    /**
     * Get 重定向是否携带匹配的URL。 
     * @return TakeUrls 重定向是否携带匹配的URL。
     */
    public Boolean [] getTakeUrls() {
        return this.TakeUrls;
    }

    /**
     * Set 重定向是否携带匹配的URL。
     * @param TakeUrls 重定向是否携带匹配的URL。
     */
    public void setTakeUrls(Boolean [] TakeUrls) {
        this.TakeUrls = TakeUrls;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamArraySimple(map, prefix + "RewriteCodes.", this.RewriteCodes);
        this.setParamArraySimple(map, prefix + "TakeUrls.", this.TakeUrls);

    }
}

