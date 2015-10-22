package processor.memoryController.videoRam;

/**
 * Created by vicboma on 22/10/15.
 */
public interface VideoRam {
    void read(int address);

    void write(int address, int value);
}
