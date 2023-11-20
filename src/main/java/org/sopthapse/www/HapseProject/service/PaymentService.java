package org.sopthapse.www.HapseProject.service;

import org.sopthapse.www.HapseProject.dto.response.Accessory.AccessoryGetResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    public AccessoryGetResponse getAccessoryByModelType(Long modelType) {
        List<String> imgUrls = List.of(
                "https://github.com/DO-SOPT-CDS-SEMINAR/Apple-Server/assets/109871579/d6469f5b-33d0-45e0-b341-6ed16d7ec14b",
                "https://github.com/DO-SOPT-CDS-SEMINAR/Apple-Server/assets/109871579/de52d722-8da7-4706-a721-a3c3d74b99ad",
                "https://github.com/DO-SOPT-CDS-SEMINAR/Apple-Server/assets/109871579/87c95758-94cb-4966-a40c-127840af8002",
                "https://github.com/DO-SOPT-CDS-SEMINAR/Apple-Server/assets/109871579/a2dd6198-f6ac-4de6-a6dc-fcff4e6347fe",
                "https://github.com/DO-SOPT-CDS-SEMINAR/Apple-Server/assets/109871579/bf088672-5838-4922-b1e2-e882ed4a1bfb"
        );
        if(modelType == 1) {
            return AccessoryGetResponse.of("11(4세대)", 449000, imgUrls);
        }
        if(modelType == 2) {
            return AccessoryGetResponse.of("12.9(6세대)", 519000, imgUrls);
        }
        throw new IllegalArgumentException("modelType이 잘못되었습니다.");
    }
}
