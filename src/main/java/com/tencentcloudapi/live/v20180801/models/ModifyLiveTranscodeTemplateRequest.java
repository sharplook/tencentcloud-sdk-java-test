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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLiveTranscodeTemplateRequest extends AbstractModel{

    /**
    * 模板 Id。
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 视频编码：h264/h265/origin，默认h264。

origin: 保持原始编码格式
    */
    @SerializedName("Vcodec")
    @Expose
    private String Vcodec;

    /**
    * 音频编码：aac，默认aac。
注意：当前该参数未生效，待后续支持！
    */
    @SerializedName("Acodec")
    @Expose
    private String Acodec;

    /**
    * 音频码率，默认0。
范围：0-500。
    */
    @SerializedName("AudioBitrate")
    @Expose
    private Long AudioBitrate;

    /**
    * 模板描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 视频码率。范围：100kbps - 8000kbps。
注: 转码模板有码率唯一要求，最终保存的码率可能与输入码率有所差别。
    */
    @SerializedName("VideoBitrate")
    @Expose
    private Long VideoBitrate;

    /**
    * 宽。0-3000。
数值必须是2的倍数，0是原始宽度
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 是否保留视频，0：否，1：是。默认1。
    */
    @SerializedName("NeedVideo")
    @Expose
    private Long NeedVideo;

    /**
    * 是否保留音频，0：否，1：是。默认1。
    */
    @SerializedName("NeedAudio")
    @Expose
    private Long NeedAudio;

    /**
    * 高。0-3000。
数值必须是2的倍数，0是原始宽度
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 帧率，默认0。
范围0-60
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * 关键帧间隔，单位：秒。
范围2-6
    */
    @SerializedName("Gop")
    @Expose
    private Long Gop;

    /**
    * 旋转角度，默认0。
可取值：0，90，180，270
    */
    @SerializedName("Rotate")
    @Expose
    private Long Rotate;

    /**
    * 编码质量：
baseline/main/high。
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
    * 是否不超过原始码率。0：否，1：是。默认0。
    */
    @SerializedName("BitrateToOrig")
    @Expose
    private Long BitrateToOrig;

    /**
    * 是否不超过原始高。0：否，1：是。默认0。
    */
    @SerializedName("HeightToOrig")
    @Expose
    private Long HeightToOrig;

    /**
    * 是否不超过原始帧率。0：否，1：是。默认0。
    */
    @SerializedName("FpsToOrig")
    @Expose
    private Long FpsToOrig;

    /**
    * 极速高清视频码率压缩比。
极速高清目标码率=VideoBitrate * (1-AdaptBitratePercent)

取值范围：0.0到0.5
    */
    @SerializedName("AdaptBitratePercent")
    @Expose
    private Float AdaptBitratePercent;

    /**
    * 是否以短边作为高度，0：否，1：是。默认0。
    */
    @SerializedName("ShortEdgeAsHeight")
    @Expose
    private Long ShortEdgeAsHeight;

    /**
     * Get 模板 Id。 
     * @return TemplateId 模板 Id。
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板 Id。
     * @param TemplateId 模板 Id。
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 视频编码：h264/h265/origin，默认h264。

origin: 保持原始编码格式 
     * @return Vcodec 视频编码：h264/h265/origin，默认h264。

origin: 保持原始编码格式
     */
    public String getVcodec() {
        return this.Vcodec;
    }

    /**
     * Set 视频编码：h264/h265/origin，默认h264。

origin: 保持原始编码格式
     * @param Vcodec 视频编码：h264/h265/origin，默认h264。

origin: 保持原始编码格式
     */
    public void setVcodec(String Vcodec) {
        this.Vcodec = Vcodec;
    }

    /**
     * Get 音频编码：aac，默认aac。
注意：当前该参数未生效，待后续支持！ 
     * @return Acodec 音频编码：aac，默认aac。
注意：当前该参数未生效，待后续支持！
     */
    public String getAcodec() {
        return this.Acodec;
    }

    /**
     * Set 音频编码：aac，默认aac。
注意：当前该参数未生效，待后续支持！
     * @param Acodec 音频编码：aac，默认aac。
注意：当前该参数未生效，待后续支持！
     */
    public void setAcodec(String Acodec) {
        this.Acodec = Acodec;
    }

    /**
     * Get 音频码率，默认0。
范围：0-500。 
     * @return AudioBitrate 音频码率，默认0。
范围：0-500。
     */
    public Long getAudioBitrate() {
        return this.AudioBitrate;
    }

    /**
     * Set 音频码率，默认0。
范围：0-500。
     * @param AudioBitrate 音频码率，默认0。
范围：0-500。
     */
    public void setAudioBitrate(Long AudioBitrate) {
        this.AudioBitrate = AudioBitrate;
    }

    /**
     * Get 模板描述。 
     * @return Description 模板描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 模板描述。
     * @param Description 模板描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 视频码率。范围：100kbps - 8000kbps。
注: 转码模板有码率唯一要求，最终保存的码率可能与输入码率有所差别。 
     * @return VideoBitrate 视频码率。范围：100kbps - 8000kbps。
注: 转码模板有码率唯一要求，最终保存的码率可能与输入码率有所差别。
     */
    public Long getVideoBitrate() {
        return this.VideoBitrate;
    }

    /**
     * Set 视频码率。范围：100kbps - 8000kbps。
注: 转码模板有码率唯一要求，最终保存的码率可能与输入码率有所差别。
     * @param VideoBitrate 视频码率。范围：100kbps - 8000kbps。
注: 转码模板有码率唯一要求，最终保存的码率可能与输入码率有所差别。
     */
    public void setVideoBitrate(Long VideoBitrate) {
        this.VideoBitrate = VideoBitrate;
    }

    /**
     * Get 宽。0-3000。
数值必须是2的倍数，0是原始宽度 
     * @return Width 宽。0-3000。
数值必须是2的倍数，0是原始宽度
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 宽。0-3000。
数值必须是2的倍数，0是原始宽度
     * @param Width 宽。0-3000。
数值必须是2的倍数，0是原始宽度
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 是否保留视频，0：否，1：是。默认1。 
     * @return NeedVideo 是否保留视频，0：否，1：是。默认1。
     */
    public Long getNeedVideo() {
        return this.NeedVideo;
    }

    /**
     * Set 是否保留视频，0：否，1：是。默认1。
     * @param NeedVideo 是否保留视频，0：否，1：是。默认1。
     */
    public void setNeedVideo(Long NeedVideo) {
        this.NeedVideo = NeedVideo;
    }

    /**
     * Get 是否保留音频，0：否，1：是。默认1。 
     * @return NeedAudio 是否保留音频，0：否，1：是。默认1。
     */
    public Long getNeedAudio() {
        return this.NeedAudio;
    }

    /**
     * Set 是否保留音频，0：否，1：是。默认1。
     * @param NeedAudio 是否保留音频，0：否，1：是。默认1。
     */
    public void setNeedAudio(Long NeedAudio) {
        this.NeedAudio = NeedAudio;
    }

    /**
     * Get 高。0-3000。
数值必须是2的倍数，0是原始宽度 
     * @return Height 高。0-3000。
数值必须是2的倍数，0是原始宽度
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 高。0-3000。
数值必须是2的倍数，0是原始宽度
     * @param Height 高。0-3000。
数值必须是2的倍数，0是原始宽度
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 帧率，默认0。
范围0-60 
     * @return Fps 帧率，默认0。
范围0-60
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set 帧率，默认0。
范围0-60
     * @param Fps 帧率，默认0。
范围0-60
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get 关键帧间隔，单位：秒。
范围2-6 
     * @return Gop 关键帧间隔，单位：秒。
范围2-6
     */
    public Long getGop() {
        return this.Gop;
    }

    /**
     * Set 关键帧间隔，单位：秒。
范围2-6
     * @param Gop 关键帧间隔，单位：秒。
范围2-6
     */
    public void setGop(Long Gop) {
        this.Gop = Gop;
    }

    /**
     * Get 旋转角度，默认0。
可取值：0，90，180，270 
     * @return Rotate 旋转角度，默认0。
可取值：0，90，180，270
     */
    public Long getRotate() {
        return this.Rotate;
    }

    /**
     * Set 旋转角度，默认0。
可取值：0，90，180，270
     * @param Rotate 旋转角度，默认0。
可取值：0，90，180，270
     */
    public void setRotate(Long Rotate) {
        this.Rotate = Rotate;
    }

    /**
     * Get 编码质量：
baseline/main/high。 
     * @return Profile 编码质量：
baseline/main/high。
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set 编码质量：
baseline/main/high。
     * @param Profile 编码质量：
baseline/main/high。
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    /**
     * Get 是否不超过原始码率。0：否，1：是。默认0。 
     * @return BitrateToOrig 是否不超过原始码率。0：否，1：是。默认0。
     */
    public Long getBitrateToOrig() {
        return this.BitrateToOrig;
    }

    /**
     * Set 是否不超过原始码率。0：否，1：是。默认0。
     * @param BitrateToOrig 是否不超过原始码率。0：否，1：是。默认0。
     */
    public void setBitrateToOrig(Long BitrateToOrig) {
        this.BitrateToOrig = BitrateToOrig;
    }

    /**
     * Get 是否不超过原始高。0：否，1：是。默认0。 
     * @return HeightToOrig 是否不超过原始高。0：否，1：是。默认0。
     */
    public Long getHeightToOrig() {
        return this.HeightToOrig;
    }

    /**
     * Set 是否不超过原始高。0：否，1：是。默认0。
     * @param HeightToOrig 是否不超过原始高。0：否，1：是。默认0。
     */
    public void setHeightToOrig(Long HeightToOrig) {
        this.HeightToOrig = HeightToOrig;
    }

    /**
     * Get 是否不超过原始帧率。0：否，1：是。默认0。 
     * @return FpsToOrig 是否不超过原始帧率。0：否，1：是。默认0。
     */
    public Long getFpsToOrig() {
        return this.FpsToOrig;
    }

    /**
     * Set 是否不超过原始帧率。0：否，1：是。默认0。
     * @param FpsToOrig 是否不超过原始帧率。0：否，1：是。默认0。
     */
    public void setFpsToOrig(Long FpsToOrig) {
        this.FpsToOrig = FpsToOrig;
    }

    /**
     * Get 极速高清视频码率压缩比。
极速高清目标码率=VideoBitrate * (1-AdaptBitratePercent)

取值范围：0.0到0.5 
     * @return AdaptBitratePercent 极速高清视频码率压缩比。
极速高清目标码率=VideoBitrate * (1-AdaptBitratePercent)

取值范围：0.0到0.5
     */
    public Float getAdaptBitratePercent() {
        return this.AdaptBitratePercent;
    }

    /**
     * Set 极速高清视频码率压缩比。
极速高清目标码率=VideoBitrate * (1-AdaptBitratePercent)

取值范围：0.0到0.5
     * @param AdaptBitratePercent 极速高清视频码率压缩比。
极速高清目标码率=VideoBitrate * (1-AdaptBitratePercent)

取值范围：0.0到0.5
     */
    public void setAdaptBitratePercent(Float AdaptBitratePercent) {
        this.AdaptBitratePercent = AdaptBitratePercent;
    }

    /**
     * Get 是否以短边作为高度，0：否，1：是。默认0。 
     * @return ShortEdgeAsHeight 是否以短边作为高度，0：否，1：是。默认0。
     */
    public Long getShortEdgeAsHeight() {
        return this.ShortEdgeAsHeight;
    }

    /**
     * Set 是否以短边作为高度，0：否，1：是。默认0。
     * @param ShortEdgeAsHeight 是否以短边作为高度，0：否，1：是。默认0。
     */
    public void setShortEdgeAsHeight(Long ShortEdgeAsHeight) {
        this.ShortEdgeAsHeight = ShortEdgeAsHeight;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Vcodec", this.Vcodec);
        this.setParamSimple(map, prefix + "Acodec", this.Acodec);
        this.setParamSimple(map, prefix + "AudioBitrate", this.AudioBitrate);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "VideoBitrate", this.VideoBitrate);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "NeedVideo", this.NeedVideo);
        this.setParamSimple(map, prefix + "NeedAudio", this.NeedAudio);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "Gop", this.Gop);
        this.setParamSimple(map, prefix + "Rotate", this.Rotate);
        this.setParamSimple(map, prefix + "Profile", this.Profile);
        this.setParamSimple(map, prefix + "BitrateToOrig", this.BitrateToOrig);
        this.setParamSimple(map, prefix + "HeightToOrig", this.HeightToOrig);
        this.setParamSimple(map, prefix + "FpsToOrig", this.FpsToOrig);
        this.setParamSimple(map, prefix + "AdaptBitratePercent", this.AdaptBitratePercent);
        this.setParamSimple(map, prefix + "ShortEdgeAsHeight", this.ShortEdgeAsHeight);

    }
}

