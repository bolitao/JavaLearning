package how2j.exception;

public class Hero {
    public String name;
    public float hp;
    public int id;
    public int damage;

    static String copyright;

    static {
        System.out.println("初始化 copyright");
        copyright = "版权由 Riot Games 公司所有";
    }

    void attactHero(Hero hero) throws EnemyHeroIsDeadException {
        if (hero.hp == 0) {
            throw new EnemyHeroIsDeadException(hero.name + "已经挂了，不需要释放技能");
        }
    }

    @Override
    public String toString() {
        return name;
    }

    class EnemyHeroIsDeadException extends Exception {
        public EnemyHeroIsDeadException() {
        }

        public EnemyHeroIsDeadException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "盖伦";
        garen.hp = 616;

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 0;

        try {
            garen.attactHero(teemo);
        } catch (EnemyHeroIsDeadException e) {
            System.out.println("异常的具体原因：" + e.getMessage());
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public static String getCopyright() {
        return copyright;
    }

    public static void setCopyright(String copyright) {
        Hero.copyright = copyright;
    }
}
