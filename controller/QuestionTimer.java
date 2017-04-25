package controller;

import java.util.Timer;
import java.util.TimerTask;

/**Real Class QuestionTimer.
 * @author Vigor Akbar
 *
 */
public class QuestionTimer extends Thread {
  /** Attribut interval adalah sebuah integer
   * digunakan sebagai nilai detik timer
   */
  private static int interval;
  /** Attribut timer adalah sebuah Timer
   * digunakan untuk menjalankan schedule task
   */
  private static Timer timer;
  /**
   * Attribut started adalah sebuah boolean
   * digunakan untuk menandai apakah thread ini sudah dijalankan atau belum
   */
  private static boolean started;
  /**
   * Attribut end adalah sebuah boolean
   * digunakan untuk tanda apakah waktu sudah habis
   */
  private static boolean end;
  /**
   * Atribut correct adalah sebuah boolean
   * digunakan untuk passing nilai boolean
   * jika user berhasil memasukkan jawaban dengan tepat
   */
  private static boolean correct;

  /**
   * Constructor tanpa parameter dari QuestionTimer
   * Menghidupkan objek QuestionTimer
   */
  public QuestionTimer () {
    end = false;
    correct = false;
  }

  /**
   * Constructor dengan parameter dari QuestionTimer
   * Menghidupkan objek QuestionTimer
   * @param time int adalah nilai interval waktu timer
   */
  public QuestionTimer(int time) {
    this.interval = time;
    end = false;
    correct = false;
    started = false;
  }

  /**
   * Getter boolean dari started
   * @return boolean : nilai kebenaran apakah thread sudah dijalankan
   */
  public boolean getStarted() {
    return started;
  }

  /**
   * Getter boolean dari end
   * @return boolean : nilai kebenaran apakah waktu sudah habis
   */
  public boolean getEnd() {
    return end;
  }

  /**
   * Setter dari interval
   * @param interval = lama waktu yang ingin diset ke timer
   */
  public void setInterval(int interval) {
    this.interval = interval;
  }

  /**
   * Setter dari correct
   * @param correct = nilai kebenaran apakah jawaban user sudah benar
   */
  public void setCorrect(boolean correct) {
    this.correct = correct;
  }
  /**
   * Prosedur run ini adalah menjalankan timer serta perintah lain thread ini
   * I.S : QuestionTimer terdefinisi
   * F.S : Timer berjalan dengan mengurangi interval
   */
  public void run() {
    started = true;
    end = false;
    correct = false;
    timer = new Timer();
    timer.scheduleAtFixedRate(new TimerTask() {
      @Override
        public void run() {
          setInterval();
        }
    }, 1000, 1000);
  }

  /** Prosedur untuk mengeset interval timer, end atau correct
   * I.S: QuestionTimer terdefinisi
   * F.S: jika interval habis, timer dihentikan, atribut end diisi true
   * Jika pengguna berhasil menjawab dengan benar, interval dan correct diset seperti semula
   * interval di decrement
   */
  private static void setInterval() {
    if(interval == 1) {
      timer.cancel();
      end = true;
    } else if (correct) {
      interval = 5;
      correct = false;
    }
      --interval;
  }
}
