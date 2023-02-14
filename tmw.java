/**
 * tmw
 */
public class tmw {

    public static void main(String[] args) {
        
    }
    public static boolean isValid(char[] walk) {
        int max_time = 10;
        int north = 0;
        int west = 0;
        int south = 0;
        int east = 0;





        //int blcok_time = 1;
        if (walk.length != max_time) {
            return false;
        }else{
            for (int i = 0; i < walk.length; i++) {
                switch (walk[i]) {
                    case 'n':
                        north +=1;
                        break;
                    case 'w':
                        west +=1;
                        break;
                    case 's':
                        south +=1;
                        break;
                    case 'e':
                        east +=1;
                        break;
                    default:
                        break;
                }
            }
            if (south == north && east == west) {
                return true;
            }else{
                return false;
            }
        }
      }
}