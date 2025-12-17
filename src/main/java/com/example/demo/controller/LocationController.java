import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @Operation(summary = "Add a new location")
    @PostMapping("/addlocation")
    public LocationEntity add(@RequestBody LocationEntity le) {
        return locationService.createLocation(le);
    }

    @Operation(summary = "Get all locations")
    @GetMapping("/showlocation")
    public List<LocationEntity> show() {
        return locationService.getAllLocation();
    }
}
