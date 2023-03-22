package com.somecoder.demo.blog.entity.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Liangkeyu
 * @since 2021-01-28
 */
@Data
@ApiModel("获取评论消息列表响应")
public class GetCommentMessageListResponse {

    @ApiModelProperty("key")
    private String key;

    @ApiModelProperty("value")
    private String value;

    @ApiModelProperty(value = "评论/回复消息主键")
    private String commentMessageId;

    @ApiModelProperty(value = "帖子主键")
    private String postId;

    @ApiModelProperty(value = "操作用户主键")
    private String fromUserId;

    @ApiModelProperty(value = "操作用户姓名")
    private String name;

    @ApiModelProperty(value = "帖子标题")
    private String postTheme;

    @ApiModelProperty(value = "内容")
    private String content;

    @ApiModelProperty(value = "消息内容")
    private String messageContent;

    @ApiModelProperty(value = "是否已读")
    private Boolean isRead;

    @ApiModelProperty(value = "创建时间")
    private String createTime;
}
