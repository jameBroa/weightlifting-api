package com.jameBroa.olyweightlifting2012;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="lifts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Athlete {
    @Id
    @JsonIgnore
    private ObjectId id;
    private Integer rank;
    private String athlete;
    private String group;
    private String bodyweight;
    private Integer snatch_att_1;
    private Integer snatch_att_2;
    private Integer snatch_att_3;
    private Integer snatch_result;
    private Integer cj_att_1;
    private Integer cj_att_2;
    private Integer cj_att_3;
    private Integer cj_result;
    private Integer total;
    private String category;
    private String snatch_to_cj;
    private String snatch_to_bw;
    private String cj_to_bw;
}
