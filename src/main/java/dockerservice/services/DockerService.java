package dockerservice.services;

import dockerservice.dto.DockerDto;
import dockerservice.entity.DockerEntity;
import dockerservice.repository.DockerEntityRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor

public class DockerService {
    private final DockerEntityRepository dockerEntityRepository;
    private final ModelMapper modelMapper;

    public String createNewPosts(DockerDto dockerDto) {
        log.info("creating posts.......");
        if (dockerDto.getTitle().isEmpty() || dockerDto.getTitle().isBlank() || dockerDto.getDescription().isEmpty() || dockerDto.getDescription().isBlank())
            return "Both Title as well as Description field is necessary and is required to " +
                    "create the post";
        dockerEntityRepository.save(modelMapper.map(dockerDto, DockerEntity.class));
        log.info("Posts created....");
        return "Posts created Successfully";

    }

    public DockerDto getPostsById(Long id) {
        log.info("Fetching Posts by id .....");
        DockerEntity dockerEntity =
                dockerEntityRepository.findById(id).orElseThrow(() -> new RuntimeException("No" +
                        " Posts found with id : " + id));
        log.info("Fetched Posts...........");
        return modelMapper.map(dockerEntity, DockerDto.class);
    }
}
