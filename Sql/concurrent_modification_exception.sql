create table if not exists concurrent_modification_exception(
hash_map_file_name Integer not null,
hash_map_password Integer null,
deep_copied_map varchar(255) null,
index_of Integer null,
main_cert varchar(255) null,
cert_type varchar(255) null,
trustore_type varchar(255) null,
static_sync varchar(255) null,
is_serializable varchar(255) null,
is_immutable varchar(255) null,
remarks varchar(255) null,
constraint concurrent_modification_exception_pk primary key(hash_map_file_name));