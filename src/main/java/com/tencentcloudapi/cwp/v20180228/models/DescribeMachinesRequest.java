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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMachinesRequest extends AbstractModel{

    /**
    * 云主机类型。
<li>CVM：表示虚拟主机</li>
<li>BM:  表示黑石物理机</li>
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * 机器所属地域。如：ap-guangzhou，ap-shanghai
    */
    @SerializedName("MachineRegion")
    @Expose
    private String MachineRegion;

    /**
    * 返回数量，默认为10，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 过滤条件。
<li>Keywords - String - 是否必填：否 - 查询关键字 </li>
<li>Status - String - 是否必填：否 - 客户端在线状态（OFFLINE: 离线/关机 | ONLINE: 在线 | UNINSTALLED：未安装 | AGENT_OFFLINE 离线| AGENT_SHUTDOWN 已关机）</li>
<li>Version - String  是否必填：否 - 当前防护版本（ PRO_VERSION：专业版 | BASIC_VERSION：基础版）</li>
<li>Risk - String 是否必填: 否 - 风险主机( yes ) </li>
<li>Os -String 是否必填: 否 - 操作系统( DescribeMachineOsList 接口 值 )
每个过滤条件只支持一个值，暂不支持多个值“或”关系查询
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 机器所属业务ID列表
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
     * Get 云主机类型。
<li>CVM：表示虚拟主机</li>
<li>BM:  表示黑石物理机</li> 
     * @return MachineType 云主机类型。
<li>CVM：表示虚拟主机</li>
<li>BM:  表示黑石物理机</li>
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set 云主机类型。
<li>CVM：表示虚拟主机</li>
<li>BM:  表示黑石物理机</li>
     * @param MachineType 云主机类型。
<li>CVM：表示虚拟主机</li>
<li>BM:  表示黑石物理机</li>
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get 机器所属地域。如：ap-guangzhou，ap-shanghai 
     * @return MachineRegion 机器所属地域。如：ap-guangzhou，ap-shanghai
     */
    public String getMachineRegion() {
        return this.MachineRegion;
    }

    /**
     * Set 机器所属地域。如：ap-guangzhou，ap-shanghai
     * @param MachineRegion 机器所属地域。如：ap-guangzhou，ap-shanghai
     */
    public void setMachineRegion(String MachineRegion) {
        this.MachineRegion = MachineRegion;
    }

    /**
     * Get 返回数量，默认为10，最大值为100。 
     * @return Limit 返回数量，默认为10，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为10，最大值为100。
     * @param Limit 返回数量，默认为10，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 过滤条件。
<li>Keywords - String - 是否必填：否 - 查询关键字 </li>
<li>Status - String - 是否必填：否 - 客户端在线状态（OFFLINE: 离线/关机 | ONLINE: 在线 | UNINSTALLED：未安装 | AGENT_OFFLINE 离线| AGENT_SHUTDOWN 已关机）</li>
<li>Version - String  是否必填：否 - 当前防护版本（ PRO_VERSION：专业版 | BASIC_VERSION：基础版）</li>
<li>Risk - String 是否必填: 否 - 风险主机( yes ) </li>
<li>Os -String 是否必填: 否 - 操作系统( DescribeMachineOsList 接口 值 )
每个过滤条件只支持一个值，暂不支持多个值“或”关系查询 
     * @return Filters 过滤条件。
<li>Keywords - String - 是否必填：否 - 查询关键字 </li>
<li>Status - String - 是否必填：否 - 客户端在线状态（OFFLINE: 离线/关机 | ONLINE: 在线 | UNINSTALLED：未安装 | AGENT_OFFLINE 离线| AGENT_SHUTDOWN 已关机）</li>
<li>Version - String  是否必填：否 - 当前防护版本（ PRO_VERSION：专业版 | BASIC_VERSION：基础版）</li>
<li>Risk - String 是否必填: 否 - 风险主机( yes ) </li>
<li>Os -String 是否必填: 否 - 操作系统( DescribeMachineOsList 接口 值 )
每个过滤条件只支持一个值，暂不支持多个值“或”关系查询
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>Keywords - String - 是否必填：否 - 查询关键字 </li>
<li>Status - String - 是否必填：否 - 客户端在线状态（OFFLINE: 离线/关机 | ONLINE: 在线 | UNINSTALLED：未安装 | AGENT_OFFLINE 离线| AGENT_SHUTDOWN 已关机）</li>
<li>Version - String  是否必填：否 - 当前防护版本（ PRO_VERSION：专业版 | BASIC_VERSION：基础版）</li>
<li>Risk - String 是否必填: 否 - 风险主机( yes ) </li>
<li>Os -String 是否必填: 否 - 操作系统( DescribeMachineOsList 接口 值 )
每个过滤条件只支持一个值，暂不支持多个值“或”关系查询
     * @param Filters 过滤条件。
<li>Keywords - String - 是否必填：否 - 查询关键字 </li>
<li>Status - String - 是否必填：否 - 客户端在线状态（OFFLINE: 离线/关机 | ONLINE: 在线 | UNINSTALLED：未安装 | AGENT_OFFLINE 离线| AGENT_SHUTDOWN 已关机）</li>
<li>Version - String  是否必填：否 - 当前防护版本（ PRO_VERSION：专业版 | BASIC_VERSION：基础版）</li>
<li>Risk - String 是否必填: 否 - 风险主机( yes ) </li>
<li>Os -String 是否必填: 否 - 操作系统( DescribeMachineOsList 接口 值 )
每个过滤条件只支持一个值，暂不支持多个值“或”关系查询
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 机器所属业务ID列表 
     * @return ProjectIds 机器所属业务ID列表
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 机器所属业务ID列表
     * @param ProjectIds 机器所属业务ID列表
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "MachineRegion", this.MachineRegion);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);

    }
}

