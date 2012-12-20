
package robot.core.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.camera.AxisCamera;
import edu.wpi.first.wpilibj.image;
//import edu.wpi.first.wpilibj.networktables;
//import edu.wpi.first.wpilibj.communication;


/**
 * The Camera subsystem provides functionality for initializing the
 * Axis Camera as well as image processing.
 * @author Rodrigo Valle
 */
public class CameraSubsystem extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private AxisCamera camera;
    private final int MAX_FPS = 10;
    private final int JPEG_COMPRESSION = 50;

    /**
     * Get an instance of the Axis Camera if it does not already exist.
     */
    private static CameraSubsystem instance = null;
    public static CameraSubsystem getInstance()
    {
        if (instance == null)
            instance = new CameraSubsystem();
        return instance;
    }

    /**
     * Initializes the Axis Camera with custom settings.
     */ 
    private CameraSubsystem()
    {
        camera = AxisCamera.getInstance();

        camera.writeCompression(JPEG_COMPRESSION);
        camera.writeMaxFPS(MAX_FPS);
        camera.writeResolution(AxisCamera.ResolutionT.k640x360);
        camera.writeExposurePriority(AxisCamera.ExposurePriorityT.imageQuality);
        camera.writeWhiteBalance(AxisCamera.WhiteBalanceT.fixedIndoor);
        camera.writeExposureControl(AxisCamera.ExposureT.hold);
    }

    /**
     * Retrives an image from the Axis Camera if a fresh one is available.
     */
    public ColorImage getImage()
    {
        if(camera.freshImage())
            return camera.getImage();
    }

    public BinaryImage processImage(ColorImage orig)
    {
        // Not implemented yet
        // Requires further testing with the Axis Camera
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

