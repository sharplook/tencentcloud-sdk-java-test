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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WafSubRuleStatus extends AbstractModel{

    /**
    * 子规则状态，on|off
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 规则id列表
    */
    @SerializedName("SubIds")
    @Expose
    private Long [] SubIds;

    /**
     * Get 子规则状态，on|off 
     * @return Switch 子规则状态，on|off
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 子规则状态，on|off
     * @param Switch 子规则状态，on|off
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 规则id列表 
     * @return SubIds 规则id列表
     */
    public Long [] getSubIds() {
        return this.SubIds;
    }

    /**
     * Set 规则id列表
     * @param SubIds 规则id列表
     */
    public void setSubIds(Long [] SubIds) {
        this.SubIds = SubIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArraySimple(map, prefix + "SubIds.", this.SubIds);

    }
}

