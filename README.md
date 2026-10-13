# TaskFlow

A modern task and project management application built with React and Spring Boot.

## Overview

TaskFlow is a Trello/Jira-inspired Kanban board application that enables individuals and teams to organize work, manage tasks with drag-and-drop interactions, collaborate in real time, and track progress through analytics dashboards.

## Features

- Kanban Boards with customizable columns
- Task Cards with labels, due dates, multiple assignees, and descriptions
- Real-Time Collaboration via WebSocket
- Drag & Drop with gap-based positioning
- Activity Logging (append-only audit trail)
- Analytics Dashboard with completion rates and team workload
- Role-Based Access (Owner, Editor, Viewer)

## Tech Stack

### Backend
- Java 21 with Spring Boot 3
- Spring Security with JWT authentication
- Spring Data JPA with MySQL 8.0+
- Spring WebSocket (STOMP)
- Flyway for database migrations

### Frontend
- React 18 with TypeScript
- Vite build tool
- TailwindCSS
- TanStack Query
- @dnd-kit for drag-and-drop
- Recharts for dashboard charts

## Project Structure

taskflow/
├── taskflow-backend/     # Spring Boot backend
├── taskflow-frontend/    # React frontend
├── docs/                 # Documentation and SRS
└── README.md

## Documentation

- [Software Requirements Specification](docs/TaskFlow_SRS_v1_4_Final.pdf)
- [Development Log](DEVLOG.md)

## Version

- Product Version: 1.0
- SRS Version: 1.4 Final