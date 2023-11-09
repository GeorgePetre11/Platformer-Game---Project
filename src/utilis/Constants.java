package utilis;

public class Constants {
    public static class Directions{
        public static final int LEFT = 0;
        public static final int RIGHT = 1;
        public static final int UP = 2;
        public static final int DOWN = 3;
    }
    public static class PlayerConstants{
        public static final int RUNNING = 1;
        public static final int IDLE = 0;
        public static final int JUMP = 2;
        public static final int FALLING = 3;
        public static final int GROUND = 4;
        public static final int HIT = 5;
        public static final int ATTACK_1 = 6;
        public static final int ATTACK_JUMP1 = 7;
        public static final int ATTACK_2 = 8;

        public static int GetSpriteAmounts(int player_action){
            switch(player_action) {

                case IDLE: return 4;
                case RUNNING:
                case JUMP: return 6;
                case FALLING:
                case ATTACK_JUMP1:
                case HIT: return 4;
                case GROUND: return 2;
                case ATTACK_1: return 7;
                case ATTACK_2: return 3;
                default: return 1;
            }
        }

    }
}
