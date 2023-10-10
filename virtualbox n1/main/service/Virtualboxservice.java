package com.apicomsqlite.aula003.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apicomsqlite.aula003.enity.VirtualBox;
import com.apicomsqlite.aula003.repository.VirtualBoxRepository;

import jakarta.transaction.Transactional;

@Service
public class VirtualBoxService {
    
    @Autowired()
    private VirtualBoxRepository VirtualBoxRepository;

    @Transactional()
    public String createVirtualBox(VirtualBox VirtualBox) {
        VirtualBoxRepository.save(VirtualBox);
        return "Produto cadastradp com sucesso";
    } 

    @Transactional()
    public List<VirtualBox> getAllVirtualBox() {
        return VirtualBoxRepository.findAll();
    }

    @Transactional()
    public void deleteAllVirtualBox() {
        VirtualBoxRepository.deleteAll();
    }

    @Transactional()
    public void updateVirtualBox(VirtualBox VirtualBox) {
       VirtualBox VirtualBoxUpdate = VirtualBoxRepository.getReferenceById(VirtualBox.getId());
       VirtualBoxUpdate.setNivel(VirtualBox.getNivel());
        VirtualBoxUpdate.setNome(VirtualBox.getNome());
        VirtualBoxUpdate.setClasse(VirtualBox.getClasse());
        VirtualBoxRepository.save(VirtualBoxUpdate);
    }
}