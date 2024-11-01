package mitigia.backend.mitigia_task;

import org.springframework.data.jpa.repository.JpaRepository;

import mitigia.backend.mitigia_task.Model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
