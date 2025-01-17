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
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudStorageEventsResponse extends AbstractModel{

    /**
    * 云存事件列表
    */
    @SerializedName("Events")
    @Expose
    private CloudStorageEvent [] Events;

    /**
    * 请求上下文, 用作查询游标
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * 拉取结果是否已经结束
    */
    @SerializedName("Listover")
    @Expose
    private Boolean Listover;

    /**
    * 拉取结果数量
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 云存事件列表 
     * @return Events 云存事件列表
     */
    public CloudStorageEvent [] getEvents() {
        return this.Events;
    }

    /**
     * Set 云存事件列表
     * @param Events 云存事件列表
     */
    public void setEvents(CloudStorageEvent [] Events) {
        this.Events = Events;
    }

    /**
     * Get 请求上下文, 用作查询游标 
     * @return Context 请求上下文, 用作查询游标
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 请求上下文, 用作查询游标
     * @param Context 请求上下文, 用作查询游标
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get 拉取结果是否已经结束 
     * @return Listover 拉取结果是否已经结束
     */
    public Boolean getListover() {
        return this.Listover;
    }

    /**
     * Set 拉取结果是否已经结束
     * @param Listover 拉取结果是否已经结束
     */
    public void setListover(Boolean Listover) {
        this.Listover = Listover;
    }

    /**
     * Get 拉取结果数量 
     * @return Total 拉取结果数量
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 拉取结果数量
     * @param Total 拉取结果数量
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Events.", this.Events);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "Listover", this.Listover);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

