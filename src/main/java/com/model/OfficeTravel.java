package com.model;

import com.jsonConverters.JsonOfficeTravelJsonConverter;
import lombok.*;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class OfficeTravel {

    private int id;
    private String name;
    private String cityOffice;





    public static List<OfficeTravel> getAllOfficesFromFile()
    {
        String MESSAGE_FILE = "travels.json";
        Path resourceDirectory = Paths.get("src", "main", "resources");
        Path fullPath = Paths.get(resourceDirectory + "\\" + MESSAGE_FILE);

        JsonOfficeTravelJsonConverter j1=new JsonOfficeTravelJsonConverter(String.valueOf(fullPath));
        return j1.fromJson().get();
    }


}
