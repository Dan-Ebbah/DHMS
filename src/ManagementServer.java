import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ManagementServer extends Remote {

    boolean addAppointment(String appointmentID, AppointmentType appointmentType, int capacity) throws RemoteException;

    String removeAppointment(String appointmentID, AppointmentType appointmentType) throws RemoteException;

    String listAppointmentAvailability(AppointmentType appointmentType) throws RemoteException;

    String bookAppointment(String patientID, String appointmentID, AppointmentType appointmentType) throws RemoteException;

    String getAppointmentSchedule(String patientID) throws RemoteException;
    String cancelAppointment(String patientID, String appointmentID) throws RemoteException;


}
