package nl.warquest.database.entity;
// Generated 18-mrt-2014 21:03:36 by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Skill generated by hbm2java
 */
@Entity
@Table(name="skill"
    ,catalog="warquest"
)
public class Skill  implements java.io.Serializable {


     private int pid;
     private int attackMax;
     private int defenseMax;
     private int healthMax;
     private int energyMax;
     private int ammoMax;
     private int skillPoints;
     private int healthTimer;
     private int energyTimer;
     private int ammoTimer;
     private int tradePoints;

    public Skill() {
    }

    public Skill(int pid, int attackMax, int defenseMax, int healthMax, int energyMax, int ammoMax, int skillPoints, int healthTimer, int energyTimer, int ammoTimer, int tradePoints) {
       this.pid = pid;
       this.attackMax = attackMax;
       this.defenseMax = defenseMax;
       this.healthMax = healthMax;
       this.energyMax = energyMax;
       this.ammoMax = ammoMax;
       this.skillPoints = skillPoints;
       this.healthTimer = healthTimer;
       this.energyTimer = energyTimer;
       this.ammoTimer = ammoTimer;
       this.tradePoints = tradePoints;
    }
   
     @Id 
    
    @Column(name="pid", nullable=false)
    public int getPid() {
        return this.pid;
    }
    
    public void setPid(int pid) {
        this.pid = pid;
    }
    
    @Column(name="attack_max", nullable=false)
    public int getAttackMax() {
        return this.attackMax;
    }
    
    public void setAttackMax(int attackMax) {
        this.attackMax = attackMax;
    }
    
    @Column(name="defense_max", nullable=false)
    public int getDefenseMax() {
        return this.defenseMax;
    }
    
    public void setDefenseMax(int defenseMax) {
        this.defenseMax = defenseMax;
    }
    
    @Column(name="health_max", nullable=false)
    public int getHealthMax() {
        return this.healthMax;
    }
    
    public void setHealthMax(int healthMax) {
        this.healthMax = healthMax;
    }
    
    @Column(name="energy_max", nullable=false)
    public int getEnergyMax() {
        return this.energyMax;
    }
    
    public void setEnergyMax(int energyMax) {
        this.energyMax = energyMax;
    }
    
    @Column(name="ammo_max", nullable=false)
    public int getAmmoMax() {
        return this.ammoMax;
    }
    
    public void setAmmoMax(int ammoMax) {
        this.ammoMax = ammoMax;
    }
    
    @Column(name="skill_points", nullable=false)
    public int getSkillPoints() {
        return this.skillPoints;
    }
    
    public void setSkillPoints(int skillPoints) {
        this.skillPoints = skillPoints;
    }
    
    @Column(name="health_timer", nullable=false)
    public int getHealthTimer() {
        return this.healthTimer;
    }
    
    public void setHealthTimer(int healthTimer) {
        this.healthTimer = healthTimer;
    }
    
    @Column(name="energy_timer", nullable=false)
    public int getEnergyTimer() {
        return this.energyTimer;
    }
    
    public void setEnergyTimer(int energyTimer) {
        this.energyTimer = energyTimer;
    }
    
    @Column(name="ammo_timer", nullable=false)
    public int getAmmoTimer() {
        return this.ammoTimer;
    }
    
    public void setAmmoTimer(int ammoTimer) {
        this.ammoTimer = ammoTimer;
    }
    
    @Column(name="trade_points", nullable=false)
    public int getTradePoints() {
        return this.tradePoints;
    }
    
    public void setTradePoints(int tradePoints) {
        this.tradePoints = tradePoints;
    }




}


