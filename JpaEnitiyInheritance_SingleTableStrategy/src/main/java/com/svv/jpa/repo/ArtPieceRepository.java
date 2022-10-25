package com.svv.jpa.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.svv.jpa.entity.ArtPiece;

@NoRepositoryBean
public interface ArtPieceRepository extends CrudRepository<ArtPiece,Long>{

}
