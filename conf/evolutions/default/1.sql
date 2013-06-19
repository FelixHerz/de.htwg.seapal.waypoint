# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table mark (
  id                        varchar(40) not null,
  name                      varchar(255),
  latitude                  double,
  longitude                 double,
  mark_type                 varchar(255),
  is_day                    boolean,
  is_night                  boolean,
  color                     varchar(255),
  function                  varchar(255),
  rev_val                   varchar(255),
  constraint pk_mark primary key (id))
;

create table waypoint (
  id                        varchar(255) not null,
  name                      varchar(255),
  latitude                  double,
  longitude                 double,
  note                      varchar(255),
  btm                       integer,
  dtm                       integer,
  sog                       integer,
  cog                       integer,
  mark                      varchar(255),
  maneuver                  integer,
  foresail                  integer,
  mainsail                  integer,
  constraint ck_waypoint_maneuver check (maneuver in (0,1,2,3,4,5,6,7,8,9)),
  constraint ck_waypoint_foresail check (foresail in (0,1,2,3,4,5,6,7)),
  constraint ck_waypoint_mainsail check (mainsail in (0,1,2,3)),
  constraint pk_waypoint primary key (id))
;

create sequence waypoint_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists mark;

drop table if exists waypoint;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists waypoint_seq;

