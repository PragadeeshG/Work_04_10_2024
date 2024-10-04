create table if not exists concurrent_modification_exception_hierarchy(
hash_map_file_name Integer not null,
files_match varchar(255) null,
hierarchy_priority varchar(255) null,
hierarchy_group varchar(255) null,
modification_level2 varchar(255) null,
modification_level3 varchar(255) null,
modification_level4 varchar(255) null,
modification_level5 varchar(255) null,
proxy_balancer varchar(255) null,
proxy_pass_match varchar(255) null,
proxy_pass varchar(255) null,
proxy_pass_reverse varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint concurrent_modification_exception_hierarchy_pk primary key(hash_map_file_name));
