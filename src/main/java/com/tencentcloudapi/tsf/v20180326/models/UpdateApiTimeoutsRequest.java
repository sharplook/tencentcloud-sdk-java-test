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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateApiTimeoutsRequest extends AbstractModel{

    /**
    * API ID 列表
    */
    @SerializedName("ApiIds")
    @Expose
    private String [] ApiIds;

    /**
    * 开启/禁用，enabled/disabled
    */
    @SerializedName("UsableStatus")
    @Expose
    private String UsableStatus;

    /**
    * 超时时间，单位毫秒，开启API超时时，必填
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
     * Get API ID 列表 
     * @return ApiIds API ID 列表
     */
    public String [] getApiIds() {
        return this.ApiIds;
    }

    /**
     * Set API ID 列表
     * @param ApiIds API ID 列表
     */
    public void setApiIds(String [] ApiIds) {
        this.ApiIds = ApiIds;
    }

    /**
     * Get 开启/禁用，enabled/disabled 
     * @return UsableStatus 开启/禁用，enabled/disabled
     */
    public String getUsableStatus() {
        return this.UsableStatus;
    }

    /**
     * Set 开启/禁用，enabled/disabled
     * @param UsableStatus 开启/禁用，enabled/disabled
     */
    public void setUsableStatus(String UsableStatus) {
        this.UsableStatus = UsableStatus;
    }

    /**
     * Get 超时时间，单位毫秒，开启API超时时，必填 
     * @return Timeout 超时时间，单位毫秒，开启API超时时，必填
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 超时时间，单位毫秒，开启API超时时，必填
     * @param Timeout 超时时间，单位毫秒，开启API超时时，必填
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ApiIds.", this.ApiIds);
        this.setParamSimple(map, prefix + "UsableStatus", this.UsableStatus);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);

    }
}

