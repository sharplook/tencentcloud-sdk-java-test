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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Column extends AbstractModel{

    /**
    * 列名称，不区分大小写，最大支持25个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 列类型，支持如下类型定义:
string|tinyint|smallint|int|bigint|boolean|float|double|decimal|timestamp|date|binary|array<data_type>|map<primitive_type, data_type>|struct<col_name : data_type [COMMENT col_comment], ...>|uniontype<data_type, data_type, ...>。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 对该类的注释。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get 列名称，不区分大小写，最大支持25个字符。 
     * @return Name 列名称，不区分大小写，最大支持25个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 列名称，不区分大小写，最大支持25个字符。
     * @param Name 列名称，不区分大小写，最大支持25个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 列类型，支持如下类型定义:
string|tinyint|smallint|int|bigint|boolean|float|double|decimal|timestamp|date|binary|array<data_type>|map<primitive_type, data_type>|struct<col_name : data_type [COMMENT col_comment], ...>|uniontype<data_type, data_type, ...>。 
     * @return Type 列类型，支持如下类型定义:
string|tinyint|smallint|int|bigint|boolean|float|double|decimal|timestamp|date|binary|array<data_type>|map<primitive_type, data_type>|struct<col_name : data_type [COMMENT col_comment], ...>|uniontype<data_type, data_type, ...>。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 列类型，支持如下类型定义:
string|tinyint|smallint|int|bigint|boolean|float|double|decimal|timestamp|date|binary|array<data_type>|map<primitive_type, data_type>|struct<col_name : data_type [COMMENT col_comment], ...>|uniontype<data_type, data_type, ...>。
     * @param Type 列类型，支持如下类型定义:
string|tinyint|smallint|int|bigint|boolean|float|double|decimal|timestamp|date|binary|array<data_type>|map<primitive_type, data_type>|struct<col_name : data_type [COMMENT col_comment], ...>|uniontype<data_type, data_type, ...>。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 对该类的注释。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Comment 对该类的注释。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 对该类的注释。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Comment 对该类的注释。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}

