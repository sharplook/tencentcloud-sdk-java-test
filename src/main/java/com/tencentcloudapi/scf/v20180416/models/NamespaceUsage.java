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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NamespaceUsage extends AbstractModel{

    /**
    * 函数数组
    */
    @SerializedName("Functions")
    @Expose
    private String [] Functions;

    /**
    * 命名空间名称
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 命名空间函数个数
    */
    @SerializedName("FunctionsCount")
    @Expose
    private Long FunctionsCount;

    /**
     * Get 函数数组 
     * @return Functions 函数数组
     */
    public String [] getFunctions() {
        return this.Functions;
    }

    /**
     * Set 函数数组
     * @param Functions 函数数组
     */
    public void setFunctions(String [] Functions) {
        this.Functions = Functions;
    }

    /**
     * Get 命名空间名称 
     * @return Namespace 命名空间名称
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间名称
     * @param Namespace 命名空间名称
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 命名空间函数个数 
     * @return FunctionsCount 命名空间函数个数
     */
    public Long getFunctionsCount() {
        return this.FunctionsCount;
    }

    /**
     * Set 命名空间函数个数
     * @param FunctionsCount 命名空间函数个数
     */
    public void setFunctionsCount(Long FunctionsCount) {
        this.FunctionsCount = FunctionsCount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Functions.", this.Functions);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "FunctionsCount", this.FunctionsCount);

    }
}

