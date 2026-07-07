package mugunghwa.blooms.roots.backend.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "image_url", nullable = false)
    private String imageUrl;

    @Column(columnDefinition = "TEXT")
    private String alt;

    @Column(name = "title_part_one", nullable = false)
    private String titlePartOne;

    @Column(name = "title_part_two", nullable = false)
    private String titlePartTwo;

    @Column(name = "title_part_three", nullable = false)
    private String titlePartThree;

    @Column(columnDefinition = "TEXT")
    private String destination;

    @Column(name = "skin_type")
    private String skinType;

    @Column(name = "product_type")
    private String productType;

    @Column(name = "volume_first_one")
    private String volumeFirstOne;

    @Column(name = "volume_second_one")
    private String volumeSecondOne;

    @Column(name = "volume_three_one")
    private String volumeThreeOne;

    @Column(name = "old_price", nullable = false)
    private BigDecimal oldPrice;

    @Column(name = "original_price", nullable = false)
    private BigDecimal originalPrice;

    @Column(name = "product_rating")
    private Double rating;

    @Column(name = "reviews_count")
    private Integer reviewsCount;

    @Column(columnDefinition = "TEXT")
    private String recommendedFor;

    @Column(name = "how_to_use", columnDefinition = "TEXT")
    private String howToUse;

    @Column(columnDefinition = "TEXT")
    private String ingredients;

    @Column(name = "img_source")
    private String imgSource;

    private String badge;

    @Column(name = "badge_icon")
    private String badgeIcon;

    @Column(name = "badge_alt")
    private String badgeAlt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_id", nullable = false)
    private Brand brand;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
}
