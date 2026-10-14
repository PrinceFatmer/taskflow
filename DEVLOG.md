# TaskFlow Development Log

This document tracks development progress, decisions, and learnings.

---

## Day 0 — Project Setup

**Date**: October 13, 2026
**Status**: In Progress

### Objectives
- [x] Install JDK 21
- [x] Install Node.js 24
- [x] Install Docker Desktop
- [x] Install Git
- [x] Configure Git identity
- [x] Create GitHub repository
- [x] Initialize project structure
- [x] Create .gitignore files
- [x] Create README.md
- [x] Create DEVLOG.md
- [x] Add SRS PDF to /docs

### Notes
- Project follows TaskFlow SRS v1.4 Final
- Development timeline: 8-10 weeks
- Tech stack: React 18 + TypeScript, Spring Boot 3, MySQL 8.0+
- Redis is optional for V1


---

## Day 1 — Project Skeleton and MySQL

**Date**: October 14, 2026
**Status**: Complete

### Objectives
- [x] Generate Spring Boot project at start.spring.io
- [x] Add dependencies: flyway-mysql, jjwt 0.12.x, springdoc
- [x] Write docker-compose.yml with MySQL 8.0
- [x] Run docker compose up -d
- [x] Connect with DBeaver MySQL client
- [x] Create application.properties and application-dev.properties
- [x] Create package layout (config, security, entity, repository, dto, service, controller, exception, util)
- [x] App boots and HikariCP connects to MySQL
- [x] Git commit and push

### Notes
- Port 3306 was occupied by local MySQL, used 3307 instead
- Spring Security generates a temporary password (expected until Day 3)
- Flyway created flyway_schema_history table, no migrations yet
- Spring Boot 4.1.1, Hibernate 7.4.5, MySQL 8.0.46