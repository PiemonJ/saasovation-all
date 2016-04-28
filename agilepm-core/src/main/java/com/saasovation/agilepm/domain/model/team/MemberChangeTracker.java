package com.saasovation.agilepm.domain.model.team;

import java.util.Date;

/**
 * Ϊ�˱�֤member�޸��¼���ִ��˳���µ�bug�����¼���ִ���¼����и���
 * @author : huanghy
 * @create : 2016/4/27 0027 ���� 4:02
 * @since : ${VERSION}
 */
public class MemberChangeTracker {
    private Date enablingOn;
    private Date nameChangedOn;
    private Date emailAddressChangedOn;

    public MemberChangeTracker(Date asOfDate, Date date, Date date1) {

    }

    public boolean canToggleEnabling(Date asOfDate){
        return this.enablingOn().before(asOfDate);
    }


    public MemberChangeTracker enablingOn(Date asOfDate){
        return new MemberChangeTracker(asOfDate,
                nameChangedOn(),
                emailAddressChangedOn());
    }


    public Date enablingOn(){
        return this.enablingOn;
    }
    public Date nameChangedOn(){
        return this.nameChangedOn;
    }

    public Date emailAddressChangedOn(){
        return this.emailAddressChangedOn;
    }
}
