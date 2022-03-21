package service;

import com.tripcatcher.tripcatcherbackend.common.auth.TokenManager;
import com.tripcatcher.tripcatcherbackend.domain.dto.UserDto;
import com.tripcatcher.tripcatcherbackend.domain.entity.User;
import com.tripcatcher.tripcatcherbackend.domain.repository.adminRepository.AdminRepository;
import com.tripcatcher.tripcatcherbackend.domain.repository.userRepository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Map;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class UserService {
    private final TokenManager tokenManager;
    private final ModelMapper modelMapper;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final UserRepository userRepository;

}
