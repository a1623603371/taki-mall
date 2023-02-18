package com.taki.careerplan.domain.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @ClassName CookbookDTO
 * @Description TODO
 * @Author Long
 * @Date 2023/2/18 17:05
 * @Version 1.0
 */

@Data
@Builder
public class CookbookDTO {
    /**
     * id
     */
    private Long id;

    /**
     * 作者id
     */
    private Long userId;

    /**
     * 作者名称
     */
    private String userName;

    /**
     * 头像
     */
    private String profile;

    /**
     * 菜谱名称
     */
    private String cookbookName;

    /**
     * 菜谱类型
     */
    private Integer cookbookType;

    /**
     * 菜谱描述
     */
    private String description;

    /**
     * 分类标签  1:私房菜  2:下饭菜  3:快手菜
     */
    private Integer categoryTag;

    /**
     * 主图链接
     */
    private String mainUrl;

    /**
     * 视频链接
     */
    private String videoUrl;

    /**
     * 制作时长  1:10分钟以内  2:10-30分钟  3:30-60分钟  4:1小时以上
     */
    private Integer cookingTime;

    /**
     * 难度  1:简单  2:一般  3:较难  4:极难
     */
    private Integer difficulty;

    /**
     * 菜谱详情
     * step：步骤，content：步骤内容，img：步骤图片
     * [{"step":"1", "content":"步骤1xx", "img":"url"}]
     */
    private List<StepDetail> cookbookDetail;

    /**
     * 食材清单
     */
    private List<Food> foods;

    /**
     * 关联的商品id
     */
    private List<Long> skuIds;

    /**
     * 小贴士
     */
    private String tips;

    /**
     * 菜谱状态  0:有效  1:删除
     */
    private Integer cookbookStatus;
}
