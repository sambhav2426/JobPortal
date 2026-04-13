package com.project.jobportal.services;

import com.project.jobportal.entity.JobPostActivity;
import com.project.jobportal.entity.JobSeekerProfile;
import com.project.jobportal.entity.JobSeekerSave;
import com.project.jobportal.repository.JobSeekerApplyRepository;
import com.project.jobportal.repository.JobSeekerSavRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerSaveService {

    private final JobSeekerSavRepository jobSeekerSaveRepository;

    public JobSeekerSaveService(JobSeekerSavRepository jobSeekerSaveRepository) {
        this.jobSeekerSaveRepository = jobSeekerSaveRepository;
    }

    public List<JobSeekerSave> getCandidatesJob(JobSeekerProfile userAccountId) {
        return jobSeekerSaveRepository.findByUserId(userAccountId);
    }

    public List<JobSeekerSave> getJobCandidates(JobPostActivity job) {
        return jobSeekerSaveRepository.findByJob(job);
    }

    public void addNew(JobSeekerSave jobSeekerSave) {
        jobSeekerSaveRepository.save(jobSeekerSave);
    }
}
