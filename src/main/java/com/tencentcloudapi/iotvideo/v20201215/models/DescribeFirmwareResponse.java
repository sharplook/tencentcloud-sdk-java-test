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

public class DescribeFirmwareResponse extends AbstractModel{

    /**
    * 固件版本号
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 固件名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 固件描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 固件Md5值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Md5sum")
    @Expose
    private String Md5sum;

    /**
    * 固件上传的秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Createtime")
    @Expose
    private Long Createtime;

    /**
    * 产品名称
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 固件版本号 
     * @return Version 固件版本号
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 固件版本号
     * @param Version 固件版本号
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 固件名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 固件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 固件名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 固件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 固件描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 固件描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 固件描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 固件描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 固件Md5值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Md5sum 固件Md5值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMd5sum() {
        return this.Md5sum;
    }

    /**
     * Set 固件Md5值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Md5sum 固件Md5值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMd5sum(String Md5sum) {
        this.Md5sum = Md5sum;
    }

    /**
     * Get 固件上传的秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Createtime 固件上传的秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreatetime() {
        return this.Createtime;
    }

    /**
     * Set 固件上传的秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param Createtime 固件上传的秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatetime(Long Createtime) {
        this.Createtime = Createtime;
    }

    /**
     * Get 产品名称 
     * @return ProductName 产品名称
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品名称
     * @param ProductName 产品名称
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
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
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Md5sum", this.Md5sum);
        this.setParamSimple(map, prefix + "Createtime", this.Createtime);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

