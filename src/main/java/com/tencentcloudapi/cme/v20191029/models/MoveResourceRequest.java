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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MoveResourceRequest extends AbstractModel{

    /**
    * 平台名称，指定访问的平台。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 待移动的原始资源信息，包含原始媒体或分类资源，以及资源归属。
    */
    @SerializedName("SourceResource")
    @Expose
    private ResourceInfo SourceResource;

    /**
    * 目标信息，包含分类及归属，仅支持移动资源到分类。
    */
    @SerializedName("DestinationResource")
    @Expose
    private ResourceInfo DestinationResource;

    /**
    * 操作者。填写用户的 Id，用于标识调用者及校验资源访问以及写权限。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get 平台名称，指定访问的平台。 
     * @return Platform 平台名称，指定访问的平台。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台名称，指定访问的平台。
     * @param Platform 平台名称，指定访问的平台。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 待移动的原始资源信息，包含原始媒体或分类资源，以及资源归属。 
     * @return SourceResource 待移动的原始资源信息，包含原始媒体或分类资源，以及资源归属。
     */
    public ResourceInfo getSourceResource() {
        return this.SourceResource;
    }

    /**
     * Set 待移动的原始资源信息，包含原始媒体或分类资源，以及资源归属。
     * @param SourceResource 待移动的原始资源信息，包含原始媒体或分类资源，以及资源归属。
     */
    public void setSourceResource(ResourceInfo SourceResource) {
        this.SourceResource = SourceResource;
    }

    /**
     * Get 目标信息，包含分类及归属，仅支持移动资源到分类。 
     * @return DestinationResource 目标信息，包含分类及归属，仅支持移动资源到分类。
     */
    public ResourceInfo getDestinationResource() {
        return this.DestinationResource;
    }

    /**
     * Set 目标信息，包含分类及归属，仅支持移动资源到分类。
     * @param DestinationResource 目标信息，包含分类及归属，仅支持移动资源到分类。
     */
    public void setDestinationResource(ResourceInfo DestinationResource) {
        this.DestinationResource = DestinationResource;
    }

    /**
     * Get 操作者。填写用户的 Id，用于标识调用者及校验资源访问以及写权限。 
     * @return Operator 操作者。填写用户的 Id，用于标识调用者及校验资源访问以及写权限。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者。填写用户的 Id，用于标识调用者及校验资源访问以及写权限。
     * @param Operator 操作者。填写用户的 Id，用于标识调用者及校验资源访问以及写权限。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamObj(map, prefix + "SourceResource.", this.SourceResource);
        this.setParamObj(map, prefix + "DestinationResource.", this.DestinationResource);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

