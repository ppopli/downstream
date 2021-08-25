package com.example.downstream;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/downstream")
public class DownStreamController {

//    @Autowired
//    private Tracer tracer;

    @PostMapping(value="/getEmployee",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Employee getEmployee(@RequestBody EmployeeRequest employeeRequest) {

//        String currentTraceId = tracer.currentSpan().context().traceIdString();
//        log.info("Request Received = {}, traceId= {}", employeeRequest, currentTraceId);
        Employee employee = new Employee();
        employee.setAge("28");
        employee.setCountry("India");
        employee.setName("Pulkit");
        employee.setId(employeeRequest.getId());

        return employee;
    }
}
