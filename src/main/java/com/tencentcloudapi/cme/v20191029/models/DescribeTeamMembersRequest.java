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

public class DescribeTeamMembersRequest extends AbstractModel{

    /**
    * 平台名称，指定访问的平台。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 团队 ID。
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * 成员 ID 列表，限指定30个指定成员。如不填，则返回指定团队下的所有成员。
    */
    @SerializedName("MemberIds")
    @Expose
    private String [] MemberIds;

    /**
    * 分页偏移量，默认值：0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回记录条数，默认值：30，最大值：30。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 操作者。填写用户的 Id，用于标识调用者及校验操作权限。
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
     * Get 团队 ID。 
     * @return TeamId 团队 ID。
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set 团队 ID。
     * @param TeamId 团队 ID。
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    /**
     * Get 成员 ID 列表，限指定30个指定成员。如不填，则返回指定团队下的所有成员。 
     * @return MemberIds 成员 ID 列表，限指定30个指定成员。如不填，则返回指定团队下的所有成员。
     */
    public String [] getMemberIds() {
        return this.MemberIds;
    }

    /**
     * Set 成员 ID 列表，限指定30个指定成员。如不填，则返回指定团队下的所有成员。
     * @param MemberIds 成员 ID 列表，限指定30个指定成员。如不填，则返回指定团队下的所有成员。
     */
    public void setMemberIds(String [] MemberIds) {
        this.MemberIds = MemberIds;
    }

    /**
     * Get 分页偏移量，默认值：0 
     * @return Offset 分页偏移量，默认值：0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，默认值：0
     * @param Offset 分页偏移量，默认值：0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回记录条数，默认值：30，最大值：30。 
     * @return Limit 返回记录条数，默认值：30，最大值：30。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回记录条数，默认值：30，最大值：30。
     * @param Limit 返回记录条数，默认值：30，最大值：30。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 操作者。填写用户的 Id，用于标识调用者及校验操作权限。 
     * @return Operator 操作者。填写用户的 Id，用于标识调用者及校验操作权限。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者。填写用户的 Id，用于标识调用者及校验操作权限。
     * @param Operator 操作者。填写用户的 Id，用于标识调用者及校验操作权限。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);
        this.setParamArraySimple(map, prefix + "MemberIds.", this.MemberIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

