package day24_loops;

public class YoutubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("starting: World's smallest cat \uD83D\uDC08- BBC");
        int seconds = 0;
        while (seconds <= 7) {
            System.out.println("Watching \uD83D\uDC08 at second:" + seconds);
            seconds++;
            Thread.sleep(500);
        }

        System.out.println("Finished watching the \uD83D\uDC08 video");
        System.out.println("Lets start another one!");


        }
    }


