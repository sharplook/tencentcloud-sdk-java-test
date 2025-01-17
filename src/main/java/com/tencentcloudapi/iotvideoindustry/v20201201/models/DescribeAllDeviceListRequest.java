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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAllDeviceListRequest extends AbstractModel{

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制，默认200
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 设备名称，需要模糊匹配设备名称时为必填
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * DeviceId列表，需要精确查找设备时为必填
    */
    @SerializedName("DeviceIds")
    @Expose
    private String [] DeviceIds;

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制，默认200 
     * @return Limit 限制，默认200
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制，默认200
     * @param Limit 限制，默认200
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 设备名称，需要模糊匹配设备名称时为必填 
     * @return NickName 设备名称，需要模糊匹配设备名称时为必填
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 设备名称，需要模糊匹配设备名称时为必填
     * @param NickName 设备名称，需要模糊匹配设备名称时为必填
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get DeviceId列表，需要精确查找设备时为必填 
     * @return DeviceIds DeviceId列表，需要精确查找设备时为必填
     */
    public String [] getDeviceIds() {
        return this.DeviceIds;
    }

    /**
     * Set DeviceId列表，需要精确查找设备时为必填
     * @param DeviceIds DeviceId列表，需要精确查找设备时为必填
     */
    public void setDeviceIds(String [] DeviceIds) {
        this.DeviceIds = DeviceIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamArraySimple(map, prefix + "DeviceIds.", this.DeviceIds);

    }
}

