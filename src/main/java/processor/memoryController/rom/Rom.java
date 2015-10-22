package processor.memoryController.rom;

/**
 * Created by vicboma on 22/10/15.
 */
public interface Rom {
    void read(int address);

    void write(int address, int value);
}
