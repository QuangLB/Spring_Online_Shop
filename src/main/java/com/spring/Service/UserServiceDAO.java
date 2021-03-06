//package com.spring.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//
//import com.spring.entity.User;
//import com.spring.repository.UserRepository;
//
//public class UserServiceDAO implements UserService{
//UserRepository userRepository;
//
//public UserServiceDAO(UserRepository userRepository) {
//	super();
//	this.userRepository = userRepository;
//}
//
//@Override
//public <S extends User> S save(S entity) {
//	return userRepository.save(entity);
//}
//
//@Override
//public Page<User> findAll(Pageable pageable) {
//	return userRepository.findAll(pageable);
//}
//
//@Override
//public List<User> findAll() {
//	return userRepository.findAll();
//}
//
//@Override
//public List<User> findAll(Sort sort) {
//	return userRepository.findAll(sort);
//}
//
//@Override
//public List<User> findAllById(Iterable<Integer> ids) {
//	return userRepository.findAllById(ids);
//}
//
//@Override
//public Optional<User> findById(Integer id) {
//	return userRepository.findById(id);
//}
//
//@Override
//public <S extends User> List<S> saveAll(Iterable<S> entities) {
//	return userRepository.saveAll(entities);
//}
//
//@Override
//public void flush() {
//	userRepository.flush();
//}
//
//@Override
//public <S extends User> S saveAndFlush(S entity) {
//	return userRepository.saveAndFlush(entity);
//}
//
//@Override
//public boolean existsById(Integer id) {
//	return userRepository.existsById(id);
//}
//
//@Override
//public <S extends User> List<S> saveAllAndFlush(Iterable<S> entities) {
//	return userRepository.saveAllAndFlush(entities);
//}
//
//@Override
//public void deleteInBatch(Iterable<User> entities) {
//	userRepository.deleteInBatch(entities);
//}
//
//@Override
//public void deleteAllInBatch(Iterable<User> entities) {
//	userRepository.deleteAllInBatch(entities);
//}
//
//@Override
//public long count() {
//	return userRepository.count();
//}
//
//@Override
//public void deleteById(Integer id) {
//	userRepository.deleteById(id);
//}
//
//@Override
//public void deleteAllByIdInBatch(Iterable<Integer> ids) {
//	userRepository.deleteAllByIdInBatch(ids);
//}
//
//@Override
//public void delete(User entity) {
//	userRepository.delete(entity);
//}
//
//@Override
//public void deleteAllById(Iterable<? extends Integer> ids) {
//	userRepository.deleteAllById(ids);
//}
//
//@Override
//public void deleteAllInBatch() {
//	userRepository.deleteAllInBatch();
//}
//
//@Override
//public void deleteAll(Iterable<? extends User> entities) {
//	userRepository.deleteAll(entities);
//}
//
//@Override
//public void deleteAll() {
//	userRepository.deleteAll();
//}
//
//@Override
//public User getById(Integer id) {
//	return userRepository.getById(id);
//}
//
//}
