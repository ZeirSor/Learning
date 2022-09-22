package GameDemo;

import javax.swing.text.StyledEditorKit;
import java.util.Random;

public class Role {
    private String name;
    private int blood;

    private String gender;

    private String face;

    String[] boyfaces = {"风流俊雅", "气宇轩昂", "相貌英俊",
            "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "婷婷玉立",
            "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};

    //attack 攻击描述：
    String[] attacks_desc = {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

    //injured 受伤描述：
    String[] injureds_desc = {
            "结果%s退了半步，毫发无损\n",
            "结果给%s造成一处瘀伤\n",
            "结果一击命中，%s痛得弯下腰\n",
            "结果%s痛苦地闷哼了一声，显然受了点内伤\n",
            "结果%s摇摇晃晃，一跤摔倒在地\n",
            "结果%s脸色一下变得惨白，连退了好几步\n",
            "结果『轰』的一声，%s口中鲜血狂喷而出\n",
            "结果%s一声惨叫，像滩软泥般塌了下去\n"
    };

    public Role(String name, int blood, String gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        this.setFace(gender);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String gender) {
        Random r = new Random();

        if (gender == "男") {
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        } else if (gender == "女") {
            int index = r.nextInt(boyfaces.length);
            this.face = girlfaces[index];
        } else {
            this.face = "面目狰狞";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void attack(Role role) {
        Random r = new Random();
        //int hurt = r.nextInt(20);
        int index = r.nextInt(attacks_desc.length);
        String KungFu = attacks_desc[index];

        System.out.printf(KungFu, this.getName(), role.getName());

        int hurt = r.nextInt(20);

        int remainBlood = role.getBlood() - hurt;
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        role.setBlood(remainBlood);

        if (remainBlood == 0) {
            System.out.printf(injureds_desc[7], role.getName());
        } else if (hurt == 0) {
            System.out.printf(injureds_desc[0], role.getName());
        } else {
            int in_index = r.nextInt(injureds_desc.length - 2) + 1;
            System.out.printf(injureds_desc[in_index], role.getName());
            System.out.println(role.getName() + "还剩" + role.getBlood() + "点血");
        }
//        if (hurt == 0) {
//            System.out.println(this.getName() + "打了" + role.getName() + " " + role.getName() + "成功躲开了");
//        } else {
//            System.out.println(this.getName() + "打了" + role.getName() + " 造成了" + hurt + "点伤害\t"
//                    + role.getName() + "还剩下" + role.getBlood() + "点血");
//        }

    }

    public void showRoleInfo() {
        System.out.print("姓名为：" + getName() + '\t');
        System.out.print("血量为：" + getBlood() + '\t');
        System.out.print("性别为：" + getGender() + '\t');
        System.out.print("长相为：" + getFace());
        System.out.println();
    }
}
