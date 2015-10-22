package processor.memoryController.bios;

/**
 * Created by vicboma on 22/10/15.
 */
public interface Bios {
    void accessCore(int index);

    void cacheL2(int index);

    void cacheL3(int index);
}
