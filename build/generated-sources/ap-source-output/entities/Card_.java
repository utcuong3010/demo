package entities;

import entities.Gender;
import entities.Status;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-20T10:10:39")
@StaticMetamodel(Card.class)
public class Card_ { 

    public static volatile SingularAttribute<Card, Gender> gender;
    public static volatile SingularAttribute<Card, String> policyNo;
    public static volatile SingularAttribute<Card, Long> id;
    public static volatile SingularAttribute<Card, String> cardNo;
    public static volatile SingularAttribute<Card, Status> status;

}